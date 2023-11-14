/*Reverse a given linkekdList.
 Constraint: i) No extra space to be used i.e. space commplexity = O(1)
            ii) Time Complexity = O(n) 

            The solution is not using collection framework
 */
    // [M1] (Iterative Method)

    
package LinkedList;

public class LL2 {
    Node head;
    private int size;

    LL2(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add- first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++;
    }
    //print
    public void printList(){
        System.out.println();
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    //deletefirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    //deletelast
    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;

        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!= null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
        LL2 list = new LL2();
        
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();

        list.addLast("list");
        list.printList();
        System.out.println();
        System.out.println("the size of the list is " + list.getsize());

        list.reverseIterate();
        list.printList();
    }
}
