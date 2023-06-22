package com.carsh.dao;



import com.carsh.entity.Car;

import java.sql.SQLException;
import java.util.Vector;

public interface CarDao {
    Vector<Car> getCarsInfo() throws SQLException;
    Car getCarsInfo(int id) throws SQLException;
    void deleteCar (Car car) throws SQLException;
    void addCar (Car car) throws SQLException;
    void changeInfoCar(Car car) throws SQLException;
    void printCars (Vector <Car> cars);
}
