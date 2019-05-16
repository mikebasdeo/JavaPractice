package FireCode.S01E11_LinkedListMiddle;

import java.util.List;

class ListNode{
    // attributes
    int data;
    ListNode next;

    // constructors
    ListNode(int data){
        this.data = data;
    }
    // methods

}

class LinkedList {

    // attributes
    ListNode head;

    //constructors
    LinkedList(){
        this.head = null;
    }
    //methods

    public void addToHead(int x){

        ListNode newNode = new ListNode(x);

        if(this.head == null){
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public void printList(){

        ListNode current = this.head;

        while(current.next != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data + "\n");
    }

    public ListNode findMiddleNode(ListNode head){

        if(head == null){
           return null;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        int position = 0;
        int newMiddle = 0;

        while(fastPointer.next != null){
            position ++;

            int oldMiddle = newMiddle;
            newMiddle = position / 2;

            int moveSlowPointer = newMiddle - oldMiddle;

            for (int i = 0; i < moveSlowPointer; i++){
                System.out.println("Moving slow pointer up 1");
                slowPointer = slowPointer.next;
            }
            fastPointer = fastPointer.next;
        }
        return slowPointer;
    }

}
public class LinkedListMiddle {

    public static void main (String[] args){

        System.out.println("Let's make a Linked List");

        LinkedList myList = new LinkedList();

        myList.addToHead(5);
        myList.addToHead(4);
        myList.addToHead(3);
        myList.addToHead(2);
        myList.addToHead(1);

        myList.printList();
        myList.findMiddleNode(myList.head);
        System.out.println((myList.findMiddleNode(myList.head)).data);

    }

}
