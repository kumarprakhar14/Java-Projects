package StringBuilder;

import java.util.Scanner;

public class delete1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println("enter the indices to delete its character");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sb.delete(x,y);
        System.out.println("the new string is " + sb);
    }
}
