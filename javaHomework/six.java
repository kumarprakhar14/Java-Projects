import java.util.Scanner;

/*Question: Write a program to find if a number is a power of 2 or not. */

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        
        if((n & (n-1))==0){
            //or (1 & n)==0) can also be used but why not, check explation below
        
            System.out.println(n + " is a power of 2");
        }else{
            System.out.println(n + " is not a power of 2");
        }
    }
}
/*Explation: The method shown in the code snippet(i.e. (1 & n)==0)) only checks if the least significant bit of the number is set or not. This means that it will fail for any number that has multiple bits set, and it will also fail for negative numbers.

On the other hand, the method using num & (num - 1) checks if there is only one bit set in the number's binary representation. This method works for all positive integers and also works for zero.

Furthermore, the method using num & (num - 1) is more efficient because it takes advantage of the fact that powers of 2 have only one bit set in their binary representation. The bitwise AND operation with (num - 1) effectively turns off the least significant bit that is set in num, which results in a new number that has fewer bits set. This operation can be repeated until the result is zero, which means that there was only one bit set in the original number. This method is much faster than checking each bit of the number individually.

Therefore, the method using num & (num - 1) is a more reliable and efficient way to check if a number is a power of 2 than simply checking the least significant bit */