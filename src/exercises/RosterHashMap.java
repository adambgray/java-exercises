package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RosterHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newName;
        Integer newID;

        System.out.println("Enter your students, or press ENTER to finish:");

        do {
            System.out.println("Name: ");
            newName = in.nextLine();

            if (!newName.equals("")) {
                System.out.println("ID: ");
                newID = in.nextInt();
                students.put(newID, newName);

                in.nextLine();
            }
        } while(!newName.equals(""));

        System.out.println("\n Class roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
