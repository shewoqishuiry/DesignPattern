package com.example.buildermodel;

//抽象的建造者
public abstract class Builder {
    abstract public void buildA();
    abstract public void buildB();
    abstract public void buildC();
    abstract public void buildD();

    abstract public Product getProduct();
}
