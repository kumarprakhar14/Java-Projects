package LinkedList;
class LL{
    Node head;
    private int size;

    LL(){
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

    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();

        list.addLast("list");
        list.printList();
        System.out.println();
        System.out.println("the size of the list is " + list.getsize());

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        
    }
}