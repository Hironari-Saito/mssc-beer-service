package guru.sfg.common.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BeerEvent  implements Serializable {

    static final long serialVersionUID = -606247013240636132L;

    private BeerDto beerDto;
}
