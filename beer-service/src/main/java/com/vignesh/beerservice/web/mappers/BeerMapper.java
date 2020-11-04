package com.vignesh.beerservice.web.mappers;


import com.vignesh.beerservice.domain.Beer;
import com.vignesh.beerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
