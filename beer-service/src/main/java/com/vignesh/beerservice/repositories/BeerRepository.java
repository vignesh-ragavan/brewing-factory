package com.vignesh.beerservice.repositories;
import com.vignesh.beerservice.web.controller.NotFoundException;
import com.vignesh.beerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vignesh.beerservice.domain.Beer;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;



@Repository

public interface BeerRepository extends JpaRepository<Beer, UUID> {



    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);

    Beer findByUpc(String upc);




}
