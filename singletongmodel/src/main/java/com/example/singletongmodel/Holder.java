package com.example.singletongmodel;


//静态内部类
//单例模式一定要构造器私有
public class Holder {

    private Holder() {

    }
    public static Holder getInstance() {
        return InnerClass.HOLDER;
    }

    public static class InnerClass {
        private static final Holder HOLDER = new Holder();
    }

}
