package com.vignesh.beerservice.web.controller;


import com.vignesh.beerservice.services.BeerService;
import com.vignesh.beerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RequiredArgsConstructor
@RequestMapping("/api/v1/")
@RestController
public class BeerController {

   private final BeerService beerService;

    @GetMapping("beer/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId)
    {
        return new ResponseEntity(beerService.getById(beerId),HttpStatus.OK);

        }


@PostMapping(path = "beer")
public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto){
    return new ResponseEntity<>(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);
        }

@PutMapping("beer/{beerId}")
public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto){
    return new ResponseEntity<>(beerService.updateBeer(beerId, beerDto), HttpStatus.NO_CONTENT);
        }

        }
