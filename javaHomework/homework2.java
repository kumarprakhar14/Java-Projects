import java.util.Scanner;

public class homework2 {

    public static void checkEven(int a){
        if(a%2 == 0){
            System.out.println("even no.");
        }else{
            System.out.println("odd no.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        checkEven(a);
    }
}


