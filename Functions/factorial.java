package Functions;

import java.util.*;
import java.util.Scanner;
public class factorial {
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid no.");
            return;
        }
        int factorial= 1;
        //loop
        for(int i=n; i>=1; i--){
            factorial= factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n\n");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        printFactorial(n);
    }
}
