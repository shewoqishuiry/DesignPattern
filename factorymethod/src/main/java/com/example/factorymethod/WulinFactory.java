package com.example.factorymethod;

public class WulinFactory implements CarFactory{
    @Override
    public Car getCar(){
        return new Wulin();
    }

}
