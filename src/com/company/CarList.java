package com.company;
/*
* ICT/19/858
* MOHAMED SAFRAS
* DATA STRUCTURE AND ALGORITHMS
* */

public class CarList {

    //Doubly Linked List

    Node head;
    Node tail;

    // Initialize head and tail to null
    public CarList(){
        head = null;
        tail = null;
    }

    // insert an element at front
    public void insertFirst(Car car){
        //Create a new node
        Node node = new Node(car);
        //Checks whether list is empty
        if(isEmpty()){
            tail = node;
        }
        //newNode's next node will be head
        node.setNext(head);
        //newNode's previous will point to null
        node.setPrevious(null);
        if(head != null){
            //head's previous node will be newNode
            head.setPrevious(node);
        }
        //newNode will become new head
        head = node;
    }

    // delete element from first
    public Node deleteFirst(){
        //Checks whether list is empty
        if(isEmpty()){
            System.out.println("Empty");
            return head;
        }else {
            // get temporary head
            Node tempHead = head;
            // get new head
            head = head.getNext();
            // set temporary head become null
            tempHead.setNext(null);
            return tempHead;
        }
    }

    //display first element
    public void displayFirst(){
        //Checks whether list is empty
        if(isEmpty()){
            System.out.println("Empty");
        }else {
            // get head or first value and display
            System.out.println(head.getValue());
        }
    }

    // insert an element at end of the list
    public void insertLast(Car car){
        //Create a new node
        Node node = new Node(car);
        //Checks whether list is empty
        if(isEmpty()){
            //Both head and tail will point to newNode
            head = tail= node;
            //head's previous will point to null
            head.setPrevious(null);
            //tail's next will point to null, as it is the last node of the list
            tail.setNext(null);
        }
        //Add newNode as new tail of the list
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.setNext(node);
            //newNode's previous will point to tail
            node.setPrevious(tail);
            //newNode will become new tail
            tail = node;
            //As it is last node, tail's next will point to null
            tail.setNext(null);
        }
    }

    // delete element from last
    public void deleteLast(){
        //Checks whether list is empty
        if(isEmpty()){
            System.out.println("Empty");
        }else {
            //Checks whether the list contains only one node
            if(head != tail){
                //Previous node to the tail will become new tail
                tail = tail.getPrevious();
                //Node next to current tail will be made null
                tail.setNext(null);
            }else {
                /*If the list contains only one element
                Then it will remove node and now both head and tail will point to null  */
                head = tail =null;
            }
        }
    }

    //display last element
    public void displayLast(){
        //Checks whether list is empty
        if(isEmpty()){
            System.out.println("Empty");
        }else {
            // get tail or last value and display
            System.out.println(tail.getValue());
        }

    }

    // check whether list is empty
    public boolean isEmpty(){
        return head == null;
    }

    // display elements from first to last
    public void display(){
        //Checks whether list is empty
        if(isEmpty()){
            System.out.println("Empty");
        }
        //get current head
        Node current = head;
        // iterate until current not equal to null
        while (current != null){
            //display current element
            System.out.println(current.getValue());
            // get next element
            current = current.getNext();
        }
    }

    // display linked list in reverse order
    public void displayReverse(){
        //Checks whether list is empty
        if(isEmpty()){
            System.out.println("Empty");
        }
        // get current tail
        Node current = tail;

        // iterate until current not equal to null
        while (current !=null){
            //display current element
            System.out.println(current.getValue());
            // get previous element
            current = current.getPrevious();
        }
    }
}
