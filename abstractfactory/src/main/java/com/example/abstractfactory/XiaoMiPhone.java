package com.example.abstractfactory;

public class XiaoMiPhone implements IPhoneProduct {
    @Override
    public void poweron() {
        System.out.println("打开小米手机");
    }

    @Override
    public void poweroff() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void call() {
        System.out.println("用小米打电话");
    }
}
