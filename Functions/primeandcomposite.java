package Functions;

import java.util.Scanner;
import java.util.*;

public class primeandcomposite{
    public static void checkPrimeAndComposite(int n) {

        int flag = 0;
        if(n == 0 || n == 1){
            System.out.println("neither prime nor composite");
            return;
        }

            for(int i=1; i<= n/2; i++){
                int remainder = n%i;
                if(remainder == 0){
                   flag = flag + 1;
                }
            }
            if(flag>2){
                System.out.println("composite no.");
            }
                else{
                    System.out.println("prime no.");
                }
                return;
            }

            public static void main(String[] args) {
               
                System.out.println("enter the value of n");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                checkPrimeAndComposite(n); 
            }
        }
        
    