package com.vignesh.beerservice.services.brewing;


import com.vignesh.beerservice.config.JmsConfig;
import com.vignesh.beerservice.domain.Beer;
import com.vignesh.beerservice.events.BrewBeerEvent;
import com.vignesh.beerservice.repositories.BeerRepository;
import com.vignesh.beerservice.services.Inventory.BeerInventoryService;
import com.vignesh.beerservice.web.mappers.BeerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class BrewingService {

    private  final BeerInventoryService beerInventoryService;
    private  final JmsTemplate jmsTemplate;
    private final BeerRepository beerRepository;
    private  final BeerMapper beerMapper;
    @Scheduled(fixedRate = 5000)
    public void checkForLowInventory(){
        List<Beer> beers=beerRepository.findAll();
        beers.forEach(beer -> {
            Integer invQOH = beerInventoryService.getOnhandInventory(beer.getId());
            log.debug("Checking Inventory for: " + beer.getBeerName() + " / " + beer.getId());
            log.debug("Min Onhand is: " + beer.getMinOnHand());
            log.debug("Inventory is: " + invQOH);
            if(beer.getMinOnHand()>=invQOH){
                jmsTemplate.convertAndSend(JmsConfig.BREWING_REQUEST_QUEUE,new BrewBeerEvent(beerMapper.beerToBeerDto(beer)));
            }
            });
    }
    }

