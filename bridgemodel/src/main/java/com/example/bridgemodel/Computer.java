package com.example.bridgemodel;

public abstract class Computer {
    protected  Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info() {
        brand.getBrandName();
    }
}



