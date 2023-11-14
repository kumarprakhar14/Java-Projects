package Functions;

import java.util.*;
import java.util.Scanner;

public class averge {
    public static float average(float a, float b, float c){
        float average = (a + b + c)/3;
        return average;
    }
    public static void main(String[] args) {
        System.out.println("Enter three nos. to find their sum");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float average = average(a, b, c);
        System.out.println("the average of the nos. is "+ average);
    }
    
}
