package com.example.abstractfactory;

public class XiaoMiRouter implements IRouterProduct {
    @Override
    public void powerOn() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void powerOff() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void usewifi() {
        System.out.println("使用小米wifi");
    }
}
