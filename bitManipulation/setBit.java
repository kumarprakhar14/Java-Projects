package bitManipulation;

import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        System.out.println("enter the position to set bit for");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
