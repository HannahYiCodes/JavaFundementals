package com.yi.day2;

public class Main {

    public static void main(String[] args) {
        Car myCar= new Car("Lambo", 4000000);
        System.out.println( myCar.getCompany() );
        myCar.getSpeed();
    }
}