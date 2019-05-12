// TODO Add to Tail
// TODO Traverse
// TODO Reverse
// TODO Try to use to solve some questions?
// TODO Generics

package linked_list;
import linked_list.helpers.helpers;

public class LinkedListMain {

    public static void main(String[] args){

        helpers.testMethod();

        System.out.println("Testing linked_list.LinkedListMain");

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
