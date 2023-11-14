package StringBuilder;
import java.util.Scanner;

public class appendSb {
    public static void main(String[] args) {
        
        /*insert can add a char to any index while append can add any char or string to the last*/

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println("enter the char/string to append");
        sb.append(sc.next());
        System.out.println(sb);
    }    
}
