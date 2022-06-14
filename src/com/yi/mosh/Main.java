package com.yi.mosh;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // primitive
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        // reference. gets current date and time
        Date now = new Date();
        now.getTime();

//        byte x = 1;
//        byte y = x;
//        x = 2;

        Point point1 = new Point(x:1, y:1);
        Point point2 = point1;

        System.out.println();

//        int temperature = 20;
//        int myAge = 25;
//        int herAge = myAge;
//        age = 35;
//        System.out.println(herAge);
    }
}