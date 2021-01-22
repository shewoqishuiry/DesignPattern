package com.example.buildermodel2;

//抽象建造者
public abstract class Builder {
    abstract Builder buildA(String msg);
    abstract Builder buildB(String msg);
    abstract Builder buildC(String msg);
    abstract Builder buildD(String msg);
    abstract public Product getProduct();
}
