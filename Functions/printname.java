package Functions;

import java.util.*;
public class printname{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();

        printMyName(name); //calling the function
    }
}
    
