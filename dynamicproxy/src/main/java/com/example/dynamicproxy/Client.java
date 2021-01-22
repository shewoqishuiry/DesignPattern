package com.example.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        ProxyInvactionHandler proxyInvactionHandler = new ProxyInvactionHandler();
        proxyInvactionHandler.setRent(host); //需要被代理的对象
        Rent rent = (Rent) proxyInvactionHandler.getProxy(); //生成动态代理类
        rent.rent();
    }
}
