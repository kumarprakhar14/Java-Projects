package Functions;

import java.util.Scanner;
import java.util.*;

public class checkeven {

    public static void checkEven(int number){
        int remainder;
        
        remainder = number%2;
        if(remainder == 0){
            System.out.println("even no.");
        }
        else{
            System.out.println("odd no.");
        }
         return;
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        checkEven(number);
    }
    
}
