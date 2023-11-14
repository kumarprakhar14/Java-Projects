package Functions;

import java.util.Scanner;

public class multiplicationtable {
    public static void printTable(int number){
        System.out.println("The table of " + number + "is ");
        
        for(int i=1; i<=10; i++){
            System.out.println(number*i);
        }
        return;
    }
    
    public static void main(String[] args){
        System.out.println("enter the number to find its table");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printTable(number);
    }
    
}
