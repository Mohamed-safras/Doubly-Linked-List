package com.company;
/*
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 * */

public class CarTest {

    public static void main(String[] args) {
        System.out.println("----------- For stack ----------\n");
        CarStack carStack = new CarStack();

        carStack.push(new Car(1));
        carStack.push(new Car(2));
        carStack.push(new Car(3));
        carStack.push(new Car(4));
        carStack.push(new Car(5));

        carStack.pop();
        carStack.pop();
        carStack.pop();
        carStack.pop();
        carStack.pop();

        carStack.peek();

        System.out.println("\n----------- For Queues ----------\n");

        CarQueue carQueue = new CarQueue();

        carQueue.insert(new Car(1));
        carQueue.insert(new Car(2));
        carQueue.remove();
        carQueue.remove();
        carQueue.remove();
        carQueue.peek();
    }
}
