package com.dn.java1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="Syrup.flavour", havingValue = "Choco")
public class ChocoSyrup implements Syrup {


    @Override
    public String getSyrupType() {
        return "This is Choco Flavoured Syrup";
    }
}
