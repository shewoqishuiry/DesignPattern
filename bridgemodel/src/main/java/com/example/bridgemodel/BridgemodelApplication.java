package com.example.bridgemodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgemodelApplication {

    public static void main(String[] args) {
        //自由组装
        Computer computer = new Laptop(new Apple());
        computer.info();

        Computer computer1 = new Desktop(new Lenovo());
        computer1.info();



        SpringApplication.run(BridgemodelApplication.class, args);
    }

}
