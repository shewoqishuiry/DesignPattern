package com.example.proxymodel.anotherproxydemo;

public class UserServiceProxy implements UserService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void addUser() {
        System.out.println("使用了addUser方法");
        userService.addUser();
    }

    @Override
    public void deleteUser() {
        System.out.println("使用了deleteUser方法");
        userService.deleteUser();
    }

    @Override
    public void modifyUser() {
        System.out.println("使用了modifyUser方法");
        userService.modifyUser();
    }

    @Override
    public void queryUser() {
        System.out.println("使用了queryUser方法");
       userService.queryUser();
    }
}
