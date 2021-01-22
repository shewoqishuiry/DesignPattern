package com.example.proxymodel.anotherproxydemo;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("添加了一个用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void modifyUser() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void queryUser() {
        System.out.println("查询了一个用户");
    }
}
