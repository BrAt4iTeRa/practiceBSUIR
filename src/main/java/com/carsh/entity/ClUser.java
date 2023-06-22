package com.carsh.entity;

import java.sql.*;

public class ClUser {
    private int userId;
    private String userEmail;
    private String userName;
    private String userPhone;
    Connection conn;
    String getUserName() {
        return userName;
    }
    String getUserEmail() {
        return userEmail;
    }
    String getUserPhone(){
        return userPhone;
    }
    int getUserId(){
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
