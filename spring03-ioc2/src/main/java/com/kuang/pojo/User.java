package com.kuang.pojo;

public class User {
    private String name;


    public User(String name) {
        this.name = name;
//        System.out.println("User的有参构造" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
