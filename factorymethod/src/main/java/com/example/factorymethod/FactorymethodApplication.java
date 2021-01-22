package com.example.factorymethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class FactorymethodApplication {

    public static void main(String[] args) {
        CarFactory teslaFactory = new TeslaFactory();
        CarFactory wulinFactory = new WulinFactory();
        System.out.println(teslaFactory.getCar().name());
        System.out.println(wulinFactory.getCar().name());

        SpringApplication.run(FactorymethodApplication.class, args);
    }

}
