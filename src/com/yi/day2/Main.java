package com.yi.day2;

public class Main {

    public static void main(String[] args) {
        Example myExample = new Example("Bill", 40);
        System.out.println( myExample.getName() );
        System.out.println( myExample.getAge() );

        Car myCar= new Car("Lambo", 4000000);
        myCar.getSpeed();
    }
}