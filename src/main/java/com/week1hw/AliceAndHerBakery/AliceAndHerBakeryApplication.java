package com.week1hw.AliceAndHerBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceAndHerBakeryApplication implements CommandLineRunner {
	@Autowired
	private CakeBaker obj;

	public static void main(String[] args){
		SpringApplication.run(AliceAndHerBakeryApplication.class, args);
	}

	public void run(String... args) throws Exception {
		obj.bakeCake();
	}

}
