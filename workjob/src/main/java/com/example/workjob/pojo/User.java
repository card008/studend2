package com.example.workjob.pojo;

public class User {
    private int userId;
    private String userName;
    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
    /**
     *提供默认空参构造方法
     *
     */
    public User() {
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
