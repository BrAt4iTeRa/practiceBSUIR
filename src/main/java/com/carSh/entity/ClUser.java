package com.carSh.entity;

import java.sql.*;
import java.util.Scanner;

public class ClUser {
    private int userID;
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
    int getUserID(){
        return userID;
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

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
