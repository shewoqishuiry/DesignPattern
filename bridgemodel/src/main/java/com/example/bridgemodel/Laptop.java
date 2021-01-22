package com.example.bridgemodel;

public class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("笔记本电脑");
    }
}