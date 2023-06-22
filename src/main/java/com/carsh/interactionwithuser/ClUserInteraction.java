package com.carsh.interactionwithuser;

import java.util.Scanner;

public class ClUserInteraction {

    public void userMenu(){
        boolean exFlag = true;
        while(exFlag){
            int action = 0;
            System.out.print("Выберите действие:\n1.Просмотр таблицы пользователей.\n2.Добавление нового пользователя.\n3.Редактирование пользователя.");
            System.out.print("\n4.Удаление пользователя.\n5.Добавить заказ пользователю.\n6.Посмотреть информацию о заказах поьзователя.\n7.Удалить заказ.");
            System.out.print("\nОжидается ввод: ");
            Scanner num = new Scanner(System.in);
            action = num.nextInt();
            switch(action){
                case 0:
                    exFlag = false;
                    break;
                case 1:
                    //printUserInfo();
                    break;
                case 2:
                    //addUser();
                    break;
                case 3:
                    //changeUserInfo();
                    break;
                case 4:
                    //deleteUser();
                    break;
                case 5:
                    //addOrderToUser();
                    break;
                case 6:
                    //printOrders();
                    break;
                case 7:
                    //deleteOrder();
                    break;
            }
        }

    }
}
