package com.vignesh.common.events;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent
{

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
