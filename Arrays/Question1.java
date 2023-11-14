package Arrays;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        System.out.println(("enter array elements"));
        //input
        for(int i=0; i<size; i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("enter the no. x to search for");
        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("x found at index: "+i);
            }
            
            }
        }
    }
