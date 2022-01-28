package com.company;
/*
 * ICT/19/858
 * MOHAMED SAFRAS
 * DATA STRUCTURE AND ALGORITHMS
 * */
import java.util.Random;

public class Car {
	final static Random rand = new Random(0); //provide a seed value to get same random sequence
	 										 // remove seed after testing;
	final static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final static String number = "0123456789";
	
	private String  licensePlate;
	private int minutes;

	public Car() {
		this(0); // create car with zero minutes
	}
	
	public Car(int time) {
		minutes = time;
		int tempRand;
		for (int i=0; i<3; i++) {
			tempRand=rand.nextInt(alpha.length());
			if (licensePlate == null)
				licensePlate = alpha.substring(tempRand, tempRand+1);
			else
				licensePlate += alpha.substring(tempRand, tempRand+1);
		}
		
		for (int i=0; i<3; i++) {
			tempRand=rand.nextInt(number.length());
			licensePlate += number.substring(tempRand, tempRand+1);
		}			
	}// constructor

	public String getLicensePlate() {
		return licensePlate;
	}

	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void decreaseMinutes() {
		minutes--;
	}

	@Override
	public String toString() {
		return "com.company.Car:" + licensePlate + " minutes=" + minutes;
	}
} // end class
