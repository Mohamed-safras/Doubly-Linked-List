package com.company;

/*
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 * */



public class CarTest {

    public static void main(String[] args) {

        CarQueue queue = new CarQueue();

        queue.insert(new Car(1));
        queue.insert(new Car(2));
        queue.insert(new Car(3));
        queue.insert(new Car(4));
        System.out.println("------------------------------");
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        System.out.println("------------------------------");
        queue.insert(new Car(1));
        queue.insert(new Car(2));
        queue.insert(new Car(3));
        queue.insert(new Car(4));
        System.out.println("------------------------------");

        System.out.println("------------------------------");
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.insert(new Car(1));
        queue.insert(new Car(2));
        queue.peek();
    }

}
