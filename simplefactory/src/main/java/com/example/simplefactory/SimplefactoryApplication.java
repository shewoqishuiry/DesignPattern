package com.example.simplefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplefactoryApplication {

    public static void main(String[] args) {
        Car tesla = CarFactory.getCar("特斯拉");
        Car wulin = CarFactory.getCar("五菱");
        System.out.println(tesla.name());
        System.out.print(wulin.name());
        SpringApplication.run(SimplefactoryApplication.class, args);
    }

}
