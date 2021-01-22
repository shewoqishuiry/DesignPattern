package com.example.bridgemodel;


class Desktop extends Computer {

    @Override
    public void info() {
        super.info();
        System.out.println("台式电脑");
    }

    public Desktop(Brand brand) {
        super(brand);
    }
}