package Arrays;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int rows = sc.nextInt();
        System.out.println("enter no. of columns");
        int cols = sc.nextInt();
        System.out.println("enter array elements");
        int[][] numbers = new int[rows][cols];
        
        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the no. x to search for");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                //compare
            if(numbers[i][j]==x){
                System.out.println(x +" found at index (" + i + "," + j + ")");
            }
            }
        }


    }
    
}
