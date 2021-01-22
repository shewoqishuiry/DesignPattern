package com.example.buildermodel2;

public class Worker extends Builder {
    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "product=" + product +
                '}';
    }

    @Override
    public Builder buildA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    public Builder buildB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    public Builder buildC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    public Builder buildD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
