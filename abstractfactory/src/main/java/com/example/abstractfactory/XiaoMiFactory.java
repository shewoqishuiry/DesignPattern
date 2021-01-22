package com.example.abstractfactory;

public class XiaoMiFactory implements IProductFactory {

    @Override
    public IPhoneProduct iphoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new XiaoMiRouter();
    }
}
