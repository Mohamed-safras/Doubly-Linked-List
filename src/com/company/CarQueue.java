package com.company;
/*
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 * */
public class CarQueue {
    CarList carList;

    public CarQueue(){
        this.carList = new CarList();
    }

    public void insert(Car car){
        carList.insertLast(car);
//        System.out.println(car);
    }

    public void remove(){
       Node node = carList.deleteFirst();
       if(node != null){
           System.out.println("removed - "+node.getValue());
       }
    }

    public void peek(){
        carList.displayFirst();
    }

}
