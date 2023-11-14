package StringBuilder;

import java.util.Scanner;

public class lengthSb {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    StringBuilder sb = new StringBuilder(sc.nextLine());
    System.out.println("the length of the string is " + sb.length());
   } 
}
