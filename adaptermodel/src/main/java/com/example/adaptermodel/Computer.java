package com.example.adaptermodel;

public class Computer {

    public void searfTheInternet(NetToUsb adapter){
        adapter.connectCableToComputer();
    }

    public static void main(String[] args) {
        //继承方式来实现适配器模式
        Computer computer = new Computer();
        NetToUsb adapter = new Adapter();
        computer.searfTheInternet(adapter);

        //接口方式来实现适配器模式
        Computer computer1 = new Computer();
        NetworkCable networkCable = new NetworkCable();
        NetToUsb adapter2 = new Adapter2(networkCable);
        computer1.searfTheInternet(adapter2);
    }
}
