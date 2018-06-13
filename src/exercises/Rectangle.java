package exercises;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length:");
        Double length = in.nextDouble();
        System.out.println("Enter the width:");
        Double width = in.nextDouble();
        Double area = length * width;
        System.out.println("Area is " + area);



    }

}
