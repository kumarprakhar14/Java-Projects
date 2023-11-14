/*Take elements(numbers in the range of 1-50) of a Linked List as input
from the user. Delete all nodes which have values greater than 25. */

package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class LL5 {
  public static void main(String[] args) {
    LinkedList <Integer> list = new LinkedList<Integer>();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no. of elements you want to enter");
    int noOfElements = sc.nextInt();
    System.out.println("enter nos. in the range of 1-50");
    for(int i=0; i<noOfElements; i++){
        int element = sc.nextInt();
        list.add(element);
    }
    for(int i=0; i<list.size(); i++){
        if(list.get(i)>25){
            list.remove(i);
        }
    }
    System.out.println(list);

  }  
}
