package com.vignesh.common.events;

import com.vignesh.beerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID= -6755043276394939294L;

    private BeerDto beerDto;
}
