package com.week1hw.AliceAndHerBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty( name = "syrup.env" , havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{
    public void getSyrupType(){
        System.out.println("Strawberry Syrup");
    }
}
