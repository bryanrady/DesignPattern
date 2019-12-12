package com.bryanrady.design.templatemethod;

/**
 * Created by Administrator on 2019/1/3.
 */

public class UserInfo {

    private String username;
    private int age;

    public UserInfo(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
