package com.kuang.pojo;

public class User1 {
    private String name;


    public User1() {
        System.out.println("User1构建");
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
