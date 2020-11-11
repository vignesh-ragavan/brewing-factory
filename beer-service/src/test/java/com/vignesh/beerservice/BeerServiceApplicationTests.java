package com.vignesh.beerservice;

import com.vignesh.beerservice.bootstrap.BeerLoader;
import com.vignesh.beerservice.services.Inventory.BeerInventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeerServiceApplicationTests {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp(){

    }

    @Test
    void contextLoads() {
    }

   // @Test
    void getOnHandInventory() {
        Integer qoh=beerInventoryService.getOnhandInventory(BeerLoader.BEER_1_UUID);

    }

}
