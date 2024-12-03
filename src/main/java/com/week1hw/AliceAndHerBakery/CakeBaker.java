package com.week1hw.AliceAndHerBakery;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
//    @Autowired
    private final Frosting fs;

//    @Autowired
    private final Syrup sy;

    @Autowired
    CakeBaker(Frosting fs, Syrup sy){
        this.fs = fs;
        this.sy = sy;
    }

    @PostConstruct
    public void func(){
        System.out.println("Construction of CakeBaker Bean is completed");
    }

    public void bakeCake(){
        System.out.print("Baking cake using ");
        fs.getFrostingType();
        System.out.print(" frosting and using ");
        sy.getSyrupType();
        System.out.println("syrup.");
    }
}
