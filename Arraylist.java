import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<>();


        //add elements
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println("myArrayList: " + list);

         //get element
        int element = list.get(0);   //0 is the index
        System.out.println("element at index 0: " + element);

        //to add element in between
        list.add(1,2);  //1 is the index & 2 is the element to be added
        System.out.println("list after adding an element at index 1: " + list);

        //set element(modify an element at an index)
        list.set(0,1);  //first is index & second is element 
        System.out.println("list after modifying element at index 0: " + list);
        
        //delete element
        list.remove(0);  //0 is the index
        System.out.println("list after deleting element at index 0: " + list);

        //size of the list
        int size = list.size();
        System.out.println("size of the arrayList: " + size);

        //loop on list
        System.out.println("traversing through the arrayList");
        for(int i=0; i<list.size(); i++){

            System.out.println(list.get(i) + " ");
        }
        System.out.println();

        //sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println("sorted arrayList: " + list);
    }
}

        