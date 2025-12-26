package com.charanjeri.AliceBakery;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public void bakeCake(){
        System.out.println("Cake baked with "+
                frosting.getFrostingType() +
                " frosting and "+
                syrup.getSyrup()+
                " syrup");
    }

}
