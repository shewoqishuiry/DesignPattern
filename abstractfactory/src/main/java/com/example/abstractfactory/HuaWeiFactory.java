package com.example.abstractfactory;

public class HuaWeiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new HuaWeiRouter();
    }
}
