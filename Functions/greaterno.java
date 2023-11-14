package Functions;

import java.util.Scanner;

public class greaterno {
    public static void greaterNo(int a, int b) {
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        return;
    }
    
    public static void main(String[] args) {
        System.out.println("enter the value the a & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNo(a, b);
    }
}
