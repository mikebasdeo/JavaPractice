package objects;


/*
* Singly -Linked List
* */

class Node {

    //attributes
    private int data;
    private Node next;

    //constructors
    public Node(int _data, Node _next){
        this.data = _data;
        this.next = _next;
    }


    //methods


    @Override
    public String toString() {
        return "Node=" +this.data;
    }
}

public class LinkedList {

    //attributes
    private Node head;

    //constructors
    public LinkedList(){
        this.head = null;
    }

    //methods

    @Override
    public String toString() {

        // ugly fix for returning a null instead of a string
        String stringToReturn;
        if(this.head == null){
            stringToReturn = "null";
        }
        else {
            stringToReturn = this.head.toString();
        }
        return stringToReturn;
    }
}
