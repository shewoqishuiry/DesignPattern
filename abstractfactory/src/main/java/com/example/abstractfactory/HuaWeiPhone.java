package com.example.abstractfactory;

public class HuaWeiPhone implements IPhoneProduct {

    @Override
    public void poweron() {
        System.out.println("打开华为手机");
    }

    @Override
    public void poweroff() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void call() {
        System.out.println("用华为打电话");
    }
}
