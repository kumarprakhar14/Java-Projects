package Arrays;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ener the size of array");
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0; i<size; i++)
        {
            System.out.println(number[i]);
        }
        
    }
    
}

