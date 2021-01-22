package com.example.buildermodel;


//具体的构建者: 工人
public class Worker extends Builder {

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    public void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    public void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    public void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    public void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
