package com.dn.java1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="Syrup.flavour", havingValue = "Strawberry")
public class StrawberrySyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "This is Strawberry Flavoured Syrup";
    }
}
