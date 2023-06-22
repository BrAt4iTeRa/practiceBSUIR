package com.carsh;


import com.carsh.entity.Car;
import com.carsh.entity.ClUser;
import com.carsh.interactionwithuser.CarInteraction;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exFlag = true;
        Car car = new Car();
        ClUser user = new ClUser();

        while(exFlag) {
            int action = 0;
            System.out.print("Выберите действие:\n1.Работа с пользователями.\n2.Работа с машинами.\n3.Работа с производителями.");
            System.out.print("\n4.Работа с точками продаж.");
            System.out.print("\nОжидается ввод: ");
            Scanner num = new Scanner(System.in);
            action = num.nextInt();
            switch (action) {
                case 0:
                    exFlag = false;
                    break;
                case 1:
                    break;
                case 2:
                    CarInteraction carInteraction = new CarInteraction(car);
                    try {
                        carInteraction.carMenu();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    break;
                case 4:
            }
        }
    }
}
