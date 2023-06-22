package com.carSh.service;

import com.carSh.bLogic.Util;
import com.carSh.dao.CarDao;
import com.carSh.entity.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class CarService extends Util implements CarDao {

    @Override
    public Vector<Car> getCarsInfo() throws SQLException {
        Connection conn = getConnection();
        Vector<Car> carList = new Vector<>();
        PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM cars");
        ResultSet resultSet = prepStatement.executeQuery();
        while(resultSet.next()){
            Car car = new Car();
            car.setCarID(resultSet.getInt("carID"));
            car.setNameCar(resultSet.getString("carName"));
            car.setPrice(resultSet.getInt("price"));
            car.setMarketID(resultSet.getInt("marketID"));
            car.setBrandID(resultSet.getInt("marketID"));
            carList.add(car);
        }
        return carList;
    }

    @Override
    public Car getCarsInfo(int ID) throws SQLException {
        Connection conn = getConnection();
        Car car = new Car();
        PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM cars WHERE carID = ?");
        ResultSet resultSet = prepStatement.executeQuery();
        while(resultSet.next()){
            car.setCarID(resultSet.getInt("carID"));
            car.setNameCar(resultSet.getString("carName"));
            car.setPrice(resultSet.getInt("price"));
            car.setMarketID(resultSet.getInt("marketID"));
            car.setBrandID(resultSet.getInt("marketID"));
        }
        return car;
    }

    @Override
    public void deleteCar(Car car) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM cars WHERE carID = ?");
        preparedStatement.setInt(1, car.getCarID());
        preparedStatement.executeUpdate();
    }
//////////////Доделать
    @Override
    public void addCar(Car car) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO cars (carName, price) values (?,?)");

        prepStatement.setString(1, car.getNameCar());
        prepStatement.setInt(2, car.getPrice());
        prepStatement.executeUpdate();
    }

    @Override
    public void changeInfoCar(Car car) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement prepStatement = conn.prepareStatement("UPDATE cars SET carName = ?, price = ? where carID = ?");

        prepStatement.setString(1, car.getNameCar());
        prepStatement.setInt(2, car.getPrice());
        prepStatement.setInt(3, car.getCarID());
        prepStatement.executeUpdate();
    }


    @Override
    public void printCars(Vector<Car> cars) {
        for (int i = 0; i < cars.size(); i++){
            System.out.printf("%d %s %d\n", cars.elementAt(i).getCarID(), cars.elementAt(i).getNameCar(), cars.elementAt(i).getPrice());
        }
    }
}
