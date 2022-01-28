package com.company;
/*
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 * */
public class CarStack {
    CarList carList ;

    public CarStack(){
       this.carList = new CarList();
    }

    public void push(Car car){
          carList.insertLast(car);
          System.out.println(car);
    }

    public void pop(){
        carList.deleteLast();
    }

    public void peek(){
        carList.displayLast();
    }
}
