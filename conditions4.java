import java.util.Scanner;


public class conditions4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        switch(c){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(b-a);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4:if(b==0){
                System.out.println("can't devide by zero");
            }else if(a>b){
            System.out.println(a/b);
            }else{
                System.out.println(b/a);
            }
            break;
            case 5:if(b==0){
             System.out.println("can't devide by zero");
            }else if(a>b){
            System.out.println(a%b);
            }else{
            System.out.println(b%a);
            }
            break;
        }
    }
    
}
