package com.charanjeri.AliceBakery.impl;

import com.charanjeri.AliceBakery.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frosting.type", havingValue = "strawberry")
public class StrawberryFrostingImpl implements Frosting {
    private final String FROSTING_TYPE = "strawberry";
    @Override
    public String getFrostingType() {
        return "";
    }
}
