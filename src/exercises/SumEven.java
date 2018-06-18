package exercises;

import java.util.ArrayList;

public class SumEven {

    public static int sumeven(ArrayList<Integer> numbers){
        int sum = 0;

        for(int i=0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                sum += numbers.get(i);
            }

        }
        return sum;
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(14);
        numbers.add(7);
        numbers.add(2);
        numbers.add(13);
        numbers.add(10);
        numbers.add(16);
        numbers.add(6);

        int finalSum = sumeven(numbers);

        System.out.println("The sum of the even numbers is " + finalSum);




    }
}


