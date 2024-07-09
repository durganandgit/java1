package com.dn.java1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
    @Autowired
    private Frosting frosting;
    @Autowired
    private Syrup syrup;

    String bakeCake(){
        return frosting.getFrostingType()+" "+ syrup.getSyrupType();
    }
}






