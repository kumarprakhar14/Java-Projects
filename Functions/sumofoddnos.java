package Functions;

import java.util.*;
import java.util.Scanner;

public class sumofoddnos {
    public static int sumOfOdd(int n) {
        int sum=0;
        for(int i=1; i<=n; i = i+2){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfOdd(n);
        System.out.println("the required sum is = " + sum);
    }
    
}
