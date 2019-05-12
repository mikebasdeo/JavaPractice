//import relevant packages
import objects.LinkedList;


public class LinkedListMain {

    public static void main(String[] args){

        System.out.println("Testing LinkedListMain");

        //try to make a linked list here. return the toString of the Node.
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addToHead(5);
        myLinkedList.addToHead(4);
        myLinkedList.addToHead(3);
        myLinkedList.addToHead(2);
        myLinkedList.addToHead(1);

        System.out.println(myLinkedList.toString());

    }


}
