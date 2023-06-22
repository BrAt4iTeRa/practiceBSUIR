package com.carSh.service;

import com.carSh.bLogic.Util;
import com.carSh.dao.ClUserDao;
import com.carSh.entity.Car;
import com.carSh.entity.ClUser;

import java.sql.SQLException;
import java.util.Vector;

public class ClUserService extends Util implements ClUserDao {

    @Override
    public Vector<ClUser> getUsersInfo() throws SQLException {
        return null;
    }

    @Override
    public Car getUsersInfo(int ID) throws SQLException {
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
