import java.util.*;
import java.util.Scanner;

public class HW3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter ur email id");
    String email = sc.next();
    String userName = "";

    for(int i=0; i<email.length(); i++){
        if(email.charAt(i)== '@'){
            break;
        }
        else{
            userName += email.charAt(i);
        }
    }
    System.out.println("the user name is: " + userName);
   } 
}
