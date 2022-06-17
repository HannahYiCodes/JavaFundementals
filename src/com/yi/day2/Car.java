package com.yi.day2;

public class Car {
    private String company;
    private int speed;

    public Car (String company, int speed) {
        this.company = company;
        this.speed = speed;
    }

    public void getSpeed() {
        System.out.println("The car's speed is " + speed + "Km/hr. It is from "+company);
    }

}