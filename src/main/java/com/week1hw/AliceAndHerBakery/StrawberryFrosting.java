package com.week1hw.AliceAndHerBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty( name = "frosting.env" , havingValue = "strawberry")
public class StrawberryFrosting implements Frosting{
    public void getFrostingType(){
        System.out.println("Strawberry Frosting");
    }
}
