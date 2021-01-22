package com.example.singletongmodel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//懒汉式单例
public class LazyMan {
    private LazyMan() {
        System.out.println(Thread.currentThread().getName());
    }

    private volatile static LazyMan lazyMan;

    public static LazyMan getInstance(){
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();
                    /**
                     * 这个new不是原子性操作
                     * 1、分配内存空间
                     * 2、执行构造方法
                     * 3、把这个对象指向这个空间
                     *
                     * 正常执行顺序是 1,2,3
                     * 如果遇到指令重排，那么可能出现132，如果先执行3，那先返回lazyman，如果此时cpu切换了线程，那么lazyman是null，第二条线程还会再new一个lazyman。
                     * 为了解决这个问题，我们加一个volatile来保证指令按正常顺序执行
                     */
                }
            }
        }
        return lazyMan;
    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(()-> LazyMan.getInstance().hashCode() ).start();
//        }
//    }

    //反射来破坏单例
    public static void main(String[] args) {
        LazyMan instance = LazyMan.getInstance();
        try {
            Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            LazyMan instance2 = declaredConstructor.newInstance();

            System.out.println(instance);
            System.out.println(instance2);
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
