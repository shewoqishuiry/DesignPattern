package com.example.singletongmodel;

//饿汉式单例
public class Hungery {



    private Hungery(){

    }

    private final static Hungery HUNGERY = new Hungery();

    public static Hungery getInstance(){
        return HUNGERY;
    }


}
