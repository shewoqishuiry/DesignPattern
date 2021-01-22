package com.example.adaptermodel;

//1、继承的方式（类适配器，单继承）
//2、组合的方式（对象适配器：常用）

public class Adapter extends NetworkCable implements NetToUsb {
    @Override
    public void connectCableToComputer() {
        super.searfTheInternet();
    }
}
