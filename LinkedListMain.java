//import relevant packages
import objects.LinkedList;

// TODOD Add to Tail
// TODO Traverse
// TODO Reverse
// TODO Try to use to solve some questions?
// TODO Generics

public class LinkedListMain {

    public static void main(String[] args){

        System.out.println("Testing LinkedListMain");

        //try to make a linked list here. return the toString of the Node.
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addToHead(6);
        myLinkedList.addToHead(5);
        myLinkedList.addToHead(4);
        myLinkedList.addToHead(3);
        myLinkedList.addToHead(2);
        myLinkedList.addToHead(1);

        System.out.println(myLinkedList.toString());

    }


}
