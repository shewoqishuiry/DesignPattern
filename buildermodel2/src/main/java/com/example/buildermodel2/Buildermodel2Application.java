package com.example.buildermodel2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.ref.PhantomReference;

@SpringBootApplication
public class Buildermodel2Application {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.getProduct();
        System.out.println(product.toString());

        product = worker.buildA("冰激凌").buildB("菠萝派").getProduct();
        System.out.println(product.toString());

        SpringApplication.run(Buildermodel2Application.class, args);
    }

}
