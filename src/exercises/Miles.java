package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter miles driven:");
        double milesDriven = in.nextDouble();
        System.out.println("Enter gallons of gas consumed:");
        double gallonsConsumed = in.nextDouble();
        double gasMileage = milesDriven / gallonsConsumed;
        System.out.println("Gas mileage is " + gasMileage + " miles per gallon.");

    }

}
