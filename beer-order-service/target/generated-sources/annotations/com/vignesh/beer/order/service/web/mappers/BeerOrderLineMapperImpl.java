package com.vignesh.beer.order.service.web.mappers;

import com.vignesh.beer.order.service.domain.BeerOrder;
import com.vignesh.beer.order.service.domain.BeerOrderLine;
import com.vignesh.beer.order.service.web.model.BeerOrderLineDto;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-04T08:59:09-0800",
    comments = "version: 1.4.0.Final, compiler: javac, environment: Java 15 (Oracle Corporation)"
)
@Component
public class BeerOrderLineMapperImpl implements BeerOrderLineMapper {

    @Override
    public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line) {
        if ( line == null ) {
            return null;
        }

        UUID id = null;
        Integer version = null;
        OffsetDateTime createdDate = null;
        OffsetDateTime lastModifiedDate = null;
        String upc = null;
        String beerName = null;
        UUID beerId = null;
        Integer orderQuantity = null;

        BeerOrderLineDto beerOrderLineDto = new BeerOrderLineDto( id, version, createdDate, lastModifiedDate, upc, beerName, beerId, orderQuantity );

        return beerOrderLineDto;
    }

    @Override
    public BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto) {
        if ( dto == null ) {
            return null;
        }

        UUID id = null;
        Long version = null;
        Timestamp createdDate = null;
        Timestamp lastModifiedDate = null;
        BeerOrder beerOrder = null;
        UUID beerId = null;
        Integer orderQuantity = null;
        Integer quantityAllocated = null;

        BeerOrderLine beerOrderLine = new BeerOrderLine( id, version, createdDate, lastModifiedDate, beerOrder, beerId, orderQuantity, quantityAllocated );

        return beerOrderLine;
    }
}
