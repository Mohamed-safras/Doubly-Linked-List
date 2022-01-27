package com.company;

/*
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 * */

public class Main {

    public static void main(String[] args) {

        CarList carList = new CarList();

        carList.insertFirst(new Car(1));
        carList.insertFirst(new Car(2));
        carList.insertFirst(new Car(3));
        carList.insertFirst(new Car(4));
        carList.insertFirst(new Car(5));
        carList.insertFirst(new Car(6));
        carList.insertFirst(new Car(7));
        carList.insertFirst(new Car(8));
        System.out.println("---------->>>>>");
        carList.display();
        System.out.println("<<<<<----------");

        carList.displayReverse();


        carList.deleteLast();
        carList.deleteLast();
        carList.deleteLast();
        carList.deleteLast();
        carList.deleteLast();
        carList.deleteLast();
        carList.deleteLast();
        carList.deleteLast();
        carList.insertLast(new Car(1));
        carList.insertLast(new Car(2));
        carList.insertLast(new Car(3));
        carList.insertFirst(new Car(0));
        carList.deleteFirst();


        System.out.println("<<<<<----------");
        carList.display();

        carList.displayFirst();
        carList.displayLast();
    }
}