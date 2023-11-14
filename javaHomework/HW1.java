package Strings;

import java.util.Scanner;

/*Question: Take an array of Strings input from the user & find the cumulative (combined)
length of all those strings. */

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        //array of strings
        String arr[] = new String[size];
        int totalLength = 0;
        System.out.println("enter the strings");

        for(int i=0; i<size; i++){
            arr[i]= sc.next();
            totalLength = totalLength + arr[i].length();
            // or, totalLength += arr[i].length();

        }
        System.out.println("the cummulative length is " + totalLength);
    }
    
}
