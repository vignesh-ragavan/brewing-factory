package com.vignesh.beerservice.services;

import com.vignesh.beerservice.web.model.BeerDto;
import com.vignesh.beerservice.web.model.BeerPagedList;
import com.vignesh.beerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest,Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId,Boolean showInventoryOnHand );

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

}
