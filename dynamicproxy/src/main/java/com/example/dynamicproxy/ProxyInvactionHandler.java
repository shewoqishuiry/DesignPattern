package com.example.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvactionHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成并得到动态代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，使用反射机制实现的
        if (method.getName().equals("rent")) {
            seeHouse();
        }
        Object result = method.invoke(rent, args);
        signContract();

        return result;
    }

    private void seeHouse() {
        System.out.println("中介带你看房！");
    }

    private void signContract() {
        System.out.println("中介和你签合同！");
    }
}
