package com.company;

/*
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 * */

public class Node {

    private Node next; // point to next node
    private Node previous; // point to previous node
    private Car value; // inserting value

    //Initialize new node
    public Node(Car car){
        next = null;
        previous = null;
        this.value = car;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Car getValue() {
        return value;
    }

    public void setValue(Car value) {
        this.value = value;
    }
}
