package com.charanjeri.AliceBakery.impl;

import com.charanjeri.AliceBakery.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.type", havingValue = "chocolate")
public class ChocolateFrostingImpl implements Frosting {

    private final String FROSTING_TYPE="chocolate";

    @Override
    public String getFrostingType() {
        return this.FROSTING_TYPE;
    }
}
