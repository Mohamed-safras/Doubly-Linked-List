package com.company;
/**
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 */

public class CarQueue {
    CarList carList;

    //creat new object
    public CarQueue(){
        this.carList = new CarList();
    }

    //insert new element in Queue
    public void insert(Car car){
        carList.insertLast(car);
        System.out.println(car);
    }

    //remove an item in Queue
    public void remove(){
       Node node = carList.deleteFirst();
       if(node != null){
           System.out.println("removed - "+node.getValue());
       }
    }

    //show top element
    public void peek(){
        carList.displayFirst();
    }

}
