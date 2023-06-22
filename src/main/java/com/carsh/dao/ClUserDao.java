package com.carsh.dao;



import com.carsh.entity.Car;
import com.carsh.entity.ClUser;

import java.sql.SQLException;
import java.util.Vector;

public interface ClUserDao {
    Vector<ClUser> getUsersInfo() throws SQLException;
    Car getUsersInfo(int id) throws SQLException;
    void deleteUser (Car car) throws SQLException;
    void addUser (Car car) throws SQLException;
    void changeInfoUser(Car car) throws SQLException;
    Car chooseUser() throws SQLException;
    void printUsers (Vector <Car> cars);
}
