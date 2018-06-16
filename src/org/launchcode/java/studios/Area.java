package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        double pi = 3.14;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a radius:");
        double radius = in.nextDouble();

        while(radius <= 0){
            System.out.println("Radius must be positive.");
            System.out.println("Enter a radius:");
            radius = in.nextDouble();
        }

        double area = pi * radius * radius;

        System.out.println("The area of a circle of radius " + radius + " is: " + area);


    }

}
