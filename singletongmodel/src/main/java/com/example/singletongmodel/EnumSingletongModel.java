package com.example.singletongmodel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//反射是破坏不了枚举的
public enum  EnumSingletongModel {
    INSTANCE;

    public EnumSingletongModel getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        EnumSingletongModel enumSingletongModel = EnumSingletongModel.INSTANCE;
        try {
            Constructor<EnumSingletongModel> constructor = EnumSingletongModel.class.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            EnumSingletongModel enumSingletongModel1 = constructor.newInstance();
            System.out.println(enumSingletongModel);
            System.out.println(enumSingletongModel1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
