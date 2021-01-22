package com.example.simplefactory;

public class CarFactory {
    public static Car getCar(String car) {
        if (car.equals("五菱")) {
            return new Wulin();
        } else if (car.equals("特斯拉")){
            return new Tesla();
        } else {
            return null;
        }
    }
}
