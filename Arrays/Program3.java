package Arrays;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int number[] = new int[size];

        //input
        System.out.println("enter array elements");
        for(int i=0; i<size; i++){
            number[i]= sc.nextInt();
        }
        System.out.println("\n");
        System.out.println("the array elements are:\n");

        //output
        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }
    }
    
}
