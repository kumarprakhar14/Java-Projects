package bitManipulation;

import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        System.out.println("enter the position to update for");
        int pos = sc.nextInt();
        System.out.println("enter the operation as below:\n1 for set and 0 for clear");
        int oper = sc.nextInt();

        int bitMask = 1<<pos;
        if(oper==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
       //clear
       int notBitMask = ~(bitMask);
       int newNumber = notBitMask & n;
       System.out.println(newNumber);     
        }
     }
}
