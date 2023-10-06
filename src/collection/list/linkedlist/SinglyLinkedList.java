package collection.list.linkedlist;

public class SinglyLinkedList {
    Node head;
    Node tail;

     class Node{
        int value;
        Node next;
        public Node(int d){
            this.value = d;
            next = null;
        }
    }

    public void addElement(int data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
         }else {
            tail.next = newNode;
         }
        tail = newNode;
    }
    public void deleteLastElement(){
         if(head == null){
             //list is empty
             return;
         }
         if(head.next == null){
             // has only one element
             head = null;
             return;
         }
         Node current = head;
         Node prev = null;
         while(current.next != null){
             prev = current;
             current = current.next;
         }
         prev.next = null;
    }
    public void deleteFirstElement(){
         if(head == null){
             return;
         }
         head = head.next;
    }
    public void displayElements(){
         if(head == null){
             System.out.println("List is empty");
             return;
         }
         Node current = head;
         while (current != null){
             System.out.print(current.value + " ");
             current = current.next;
         }
    }
    public void reverseList(){
        Node prev = null;
        Node next = null;
        Node current = head;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addElement(2);
        list.addElement(5);
        list.addElement(4);
        list.addElement(8);
        System.out.println("\n Initial list\n");
        list.displayElements();
        list.reverseList();
        System.out.println("\n After Reversing list\n");
        list.displayElements();
        list.deleteLastElement();
        System.out.println("\n After Deleting the last element from the list\n");
        list.displayElements();
        list.deleteFirstElement();
        System.out.println("\n After Deleting the first element from the list\n");
        list.displayElements();
    }
}
