package com.dn.java1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="Frosting.flavour", havingValue = "Choco")
public class ChocoFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "This is Choco Flavoured Frosting";
    }
}
