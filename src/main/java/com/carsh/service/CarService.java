package com.carsh.service;

import com.carsh.businesslogic.Util;
import com.carsh.dao.CarDao;
import com.carsh.entity.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            car.setCarId(resultSet.getInt("carID"));
            car.setNameCar(resultSet.getString("carName"));
            car.setPrice(resultSet.getInt("price"));
            car.setMarketId(resultSet.getInt("marketID"));
            car.setBrandId(resultSet.getInt("marketID"));
            carList.add(car);
        }
        return carList;
    }

    @Override
    public Car getCarsInfo(int id) throws SQLException {
        Connection conn = getConnection();
        Car car = new Car();
        PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM cars WHERE carID = ?");
        ResultSet resultSet = prepStatement.executeQuery();
        while(resultSet.next()){
            car.setCarId(resultSet.getInt("carID"));
            car.setNameCar(resultSet.getString("carName"));
            car.setPrice(resultSet.getInt("price"));
            car.setMarketId(resultSet.getInt("marketID"));
            car.setBrandId(resultSet.getInt("marketID"));
        }
        return car;
    }

    @Override
    public void deleteCar(Car car) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM cars WHERE carID = ?");
        preparedStatement.setInt(1, car.getCarId());
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
        prepStatement.setInt(3, car.getCarId());
        prepStatement.executeUpdate();
    }


    @Override
    public void printCars(Vector<Car> cars) {
        for (int i = 0; i < cars.size(); i++){
            System.out.printf("%d %s %d\n", cars.elementAt(i).getCarId(), cars.elementAt(i).getNameCar(), cars.elementAt(i).getPrice());
        }
    }
}
