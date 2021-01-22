package com.example.abstractfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractfactoryApplication {

    public static void main(String[] args) {

        /* 小米产品族的生产*/
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IPhoneProduct iXiaoMiPhone = xiaoMiFactory.iphoneProduct();
        IRouterProduct iXiaoMiRouter= xiaoMiFactory.irouterProduct();
        iXiaoMiPhone.call();
        iXiaoMiRouter.usewifi();


        /* 小米产品族的生产*/
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        IPhoneProduct iHuaWeiPhone = huaWeiFactory.iphoneProduct();
        IRouterProduct iHuaweiRouter = huaWeiFactory.irouterProduct();
        iHuaWeiPhone.call();
        iHuaweiRouter.usewifi();


        SpringApplication.run(AbstractfactoryApplication.class, args);
    }

}
