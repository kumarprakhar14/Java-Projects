package StringBuilder;

import java.util.Scanner;

public class reverseSb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to reverse it");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back =sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
