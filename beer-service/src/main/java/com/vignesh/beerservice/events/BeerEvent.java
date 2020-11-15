package com.vignesh.beerservice.events;

import com.vignesh.beerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent {
    private final BeerDto beerDto;
}
