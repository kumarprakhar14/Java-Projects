package bitManipulation;
import java.util.Scanner;

public class getBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        System.out.println("enter the position to search bit");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }   
}
