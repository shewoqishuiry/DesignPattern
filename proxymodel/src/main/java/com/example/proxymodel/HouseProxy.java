package com.example.proxymodel;

//中介
public class HouseProxy implements Rent{
    private Host host;

    public HouseProxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        signContact();
        getProxyMoney();
    }

    //中介带你看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void signContact(){
        System.out.println("中介和你签合同");
    }

    public void getProxyMoney() {
        System.out.println("中介收中介费");
    }
}
