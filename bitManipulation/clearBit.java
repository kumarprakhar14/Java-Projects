package bitManipulation;

import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        System.out.println("enter the position to clear bit at");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
