package com.example.dynamicproxy;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子！");
    }
}
