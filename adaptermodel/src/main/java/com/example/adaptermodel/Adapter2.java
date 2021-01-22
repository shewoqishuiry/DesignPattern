package com.example.adaptermodel;


//1、继承的方式（类适配器，单继承）
//2、组合的方式（对象适配器：常用）
public class Adapter2 implements NetToUsb {

    private NetworkCable networkCable;

    public Adapter2(NetworkCable networkCable) {
        this.networkCable = networkCable;
    }

    @Override
    public void connectCableToComputer() {
        networkCable.searfTheInternet();
    }
}
