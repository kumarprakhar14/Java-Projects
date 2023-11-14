package Strings;

import java.util.Scanner;

public class stringConcatenation {
    public static void main(String[] args) {
        //concatenation
        // String firstName = "Kumar";
        // String lastName = "Prakhar";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur first name");
        String firstName = sc.nextLine();
        System.out.println("enter ur middle name (if any)");
        String middleName = sc.nextLine();
        System.out.println("enter ur last name");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
    }
}
