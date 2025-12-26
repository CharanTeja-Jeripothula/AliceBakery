package com.charanjeri.AliceBakery.impl;

import com.charanjeri.AliceBakery.Syrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup.type", havingValue = "strawberry")
public class StrawberrySyrupImpl implements Syrup {
    private final String SYRUP_TYPE = "strawberry";
    @Override
    public String getSyrup() {
        return this.SYRUP_TYPE;
    }
}
