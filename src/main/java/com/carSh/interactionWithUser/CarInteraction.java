package com.carSh.interactionWithUser;

import com.carSh.bLogic.Util;
import com.carSh.entity.Car;
import com.carSh.service.CarService;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class CarInteraction extends Util {
    private Car car;
    public CarInteraction (Car car){
        this.car = car;
    }
    public Vector<Car> printCars(Vector<Car> cars) {
        for (int i = 0; i < cars.size(); i++){
            System.out.printf("%d %s %d\n", cars.elementAt(i).getCarID(), cars.elementAt(i).getNameCar(), cars.elementAt(i).getPrice());
        }
        return cars;
    }
    public void addCars(){
        Scanner num = new Scanner(System.in);
        System.out.print("Введите имя авто: ");
        car.setNameCar(num.nextLine());
        System.out.print("Введите цену автомобиля: ");
        car.setPrice(num.nextInt());
    }
    public void changeCarsInfo(CarService carService) throws SQLException {
        chooseCar(carService);
        Scanner num = new Scanner(System.in);
        System.out.print("Введите название авто: ");
        car.setNameCar(num.nextLine());
        System.out.print("Введите цену авто: ");
        car.setPrice(num.nextInt());

    }
    public void chooseCar(CarService carService) throws SQLException {
        Vector <Car> cars = new Vector<>();
        cars = printCars(carService.getCarsInfo());
        System.out.print("Выберите ID машины: ");
        Scanner num = new Scanner(System.in);
        int ID = num.nextInt();
        for (int i = 0; i < cars.size(); i ++)
            if (cars.elementAt(i).getCarID() == ID)
                car = cars.elementAt(i);
    }


    public void carMenu() throws SQLException {
        boolean exFlag = true;
        CarService carService = new CarService();
        while(exFlag){
            int action = 0;
            System.out.print("Выберите действие:\n1.Просмотр таблицы автомобилей.\n2.Добавление нового автомобиля.\n3.Редактирование авто.");
            System.out.print("\n4.Удаление авто.\n5.\n6.");
            System.out.print("\nОжидается ввод: ");
            Scanner num = new Scanner(System.in);
            action = num.nextInt();
            switch(action){
                case 0:
                    exFlag = false;
                    break;
                case 1:
                    printCars(carService.getCarsInfo());
                    break;
                case 2:
                    addCars();
                    carService.addCar(car);
                    break;
                case 3:
                    changeCarsInfo(carService);
                    carService.changeInfoCar(car);
                    break;
                case 4:
                    chooseCar(carService);
                    carService.deleteCar(car);
                    break;
            }
        }

    }
}
