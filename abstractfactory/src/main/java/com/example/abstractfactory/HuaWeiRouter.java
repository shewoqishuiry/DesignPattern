package com.example.abstractfactory;

public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void powerOn() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void powerOff() {
        System.out.println("关闭华为路由");
    }

    @Override
    public void usewifi() {
        System.out.println("使用华为wifi");
    }
}
