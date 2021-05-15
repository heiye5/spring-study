package com.kuang.demo2;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.add();
    }

    public void update() {
        log("update");
        userService.add();
    }

    public void query() {
        log("query");
        userService.add();
    }


    public void log(String msg){
        System.out.println("使用" + msg + "方法");
    }
}
