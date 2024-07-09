package com.dn.java1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="Frosting.flavour", havingValue ="Strawberry")
public class StrawberryFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "This is Strawberry Flavoured Syrup";
    }
}
