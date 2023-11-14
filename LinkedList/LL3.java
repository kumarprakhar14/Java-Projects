/*Reverse a given linkekdList.
 Constraint: i) No extra space to be used i.e. space commplexity = O(1)
            ii) Time Complexity = O(n) 

            The solution is not using collection framework
 */
    // [M2] (Recursive Method)


package LinkedList;

public class LL3 {
    
    Node head;
    private int size;

    LL3(){
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

   public Node reverseRecursive(Node head){
    if(head == null || head.next == null){
        return head;
    }
    Node newHead = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
   }


    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
        LL3 list = new LL3();
        
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();

        list.addLast("list");
        list.printList();
        System.out.println();
        System.out.println("the size of the list is " + list.getsize());

        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
