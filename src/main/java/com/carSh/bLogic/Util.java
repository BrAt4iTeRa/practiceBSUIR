package com.carSh.bLogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private String url = "jdbc:mysql://localhost:3306/autoshop";
    private String userName = "root";
    private String password = "1234qwerty";
    public Connection getConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e){
            throw  new RuntimeException(e);
        }


        return connection;
    }
}
