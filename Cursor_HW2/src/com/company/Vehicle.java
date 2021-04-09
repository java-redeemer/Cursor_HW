package com.company;

import java.util.Scanner;

public class Vehicle {
    public static void main (String[] args) {
        Car myCar = new Car ("Cursor Car");

        System.out.println ("Название автомобиля: " + myCar.getName ());
        Scanner conditions = new Scanner (System.in);
        System.out.println ("Введите начальную скорость:");
//        if (conditions.hasNextInt()) {
        int speed = conditions.nextInt ();
        System.out.println ("Начальная скорость " + speed + " км/ч");
//        }
//        else {
//            System.out.println ("Введите числовое значение!");
//        }
        System.out.println ("Включите передачу:");
//        if (conditions.hasNextInt()) {
        int gear = conditions.nextInt ();
        System.out.println ("Текущая передача " + gear);
//        }
//        else {
//            System.out.println ("Введите числовое значение!");
//        }
        conditions.close ();
        myCar.start ();
        myCar.movement (speed, gear);
        myCar.stop();
    }
    static class Car {

        private final String name;
        private boolean engineEnabled;


        Car (String name) {
            this.name = name;
        }
        String getName () {
            return name;
        }

        void start () {
            engineEnabled = true;
            System.out.println ("Пытаемся начать движение");
        }

        void stop () {
            engineEnabled = false;
            System.out.println ("Автомобиль не двигается");
        }

        void movement (int speed, int gear) {
            if (speed > 0 && gear > 0 && engineEnabled)
                System.out.println (name + " едет со скоростью " + speed + " км в час и " + gear + " передачей ");
            else {
                stop ();
            }
        }
    }

}
