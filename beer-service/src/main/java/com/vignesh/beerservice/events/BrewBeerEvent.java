package com.vignesh.beerservice.events;

import com.vignesh.beerservice.web.model.BeerDto;

public class BrewBeerEvent extends  BeerEvent
{

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
