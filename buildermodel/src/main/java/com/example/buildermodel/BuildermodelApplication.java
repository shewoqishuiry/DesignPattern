package com.example.buildermodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuildermodelApplication {

    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        Product product = director.build(new Worker());
        System.out.println(product.toString());
        //修改构建顺序，只需要修改指挥者
        SpringApplication.run(BuildermodelApplication.class, args);
    }

}
