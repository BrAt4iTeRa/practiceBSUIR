package com.carsh.service;

import com.carsh.businesslogic.Util;
import com.carsh.dao.ClUserDao;
import com.carsh.entity.Car;
import com.carsh.entity.ClUser;

import java.sql.SQLException;
import java.util.Vector;

public class ClUserService extends Util implements ClUserDao {

    @Override
    public Vector<ClUser> getUsersInfo() throws SQLException {
        return null;
    }

    @Override
    public Car getUsersInfo(int id) throws SQLException {
        return null;
    }

    @Override
    public void deleteUser(Car car) throws SQLException {

    }

    @Override
    public void addUser(Car car) throws SQLException {

    }

    @Override
    public void changeInfoUser(Car car) throws SQLException {

    }

    @Override
    public Car chooseUser() throws SQLException {
        return null;
    }

    @Override
    public void printUsers(Vector<Car> cars) {

    }
}
