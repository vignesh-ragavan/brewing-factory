package com.vignesh.beerservice.events;

import com.vignesh.beerservice.web.model.BeerDto;

public class NewInventoryEvent  extends BeerEvent
{

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
