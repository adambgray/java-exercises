package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FiveLetters {

    public static void printFives(ArrayList<String> wordList){
        for(int i = 0; i < wordList.size(); i++){
            if(wordList.get(i).length() == 5){
                System.out.println(wordList.get(i));
            }
        }
    }

    public static void main(String[] args){

        ArrayList<String> myWordList = new ArrayList<>();
        myWordList.add("Plural");
        myWordList.add("House");
        myWordList.add("Town");
        myWordList.add("Coffee");
        myWordList.add("Computer");
        myWordList.add("Tiger");
        myWordList.add("Wines");
        myWordList.add("Table");
        myWordList.add("Chairs");
        myWordList.add("Mediocre");

        printFives(myWordList);

    }
}
