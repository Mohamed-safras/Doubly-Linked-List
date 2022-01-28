package com.company;
/*
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 * */
public class CarStack {
    CarList carList ;

    //creat new object
    public CarStack(){
       this.carList = new CarList();
    }

    //push an item in stack
    public void push(Car car){
          carList.insertLast(car);
          System.out.println(car);
    }

    //remove an item in stack
    public void pop(){
        carList.deleteLast();

    }

    //show top element
    public void peek(){
        System.out.print("peek - ");
        carList.displayLast();
    }
}
