package com.week1hw.AliceAndHerBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty( name = "syrup.env" , havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{
    public void getSyrupType(){
        System.out.println("Chocolate Syrup");
    }
}
