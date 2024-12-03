package com.week1hw.AliceAndHerBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty( name = "frosting.env" , havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    public void getFrostingType(){
        System.out.println("Chocolate Frosting");
    }
}
