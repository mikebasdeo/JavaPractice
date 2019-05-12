package objects;

/*
* Singly -Linked List
* */

//***************************************************************************//

// TODO Convert to Generics
class Node {
    //attributes
    private int data;
    private Node next;

    //constructors
    public Node(int _data){
        this.data = _data;
    }
    //methods
    public void setNext(Node _new_next_node){
        this.next = _new_next_node;
    }

    @Override
    public String toString() {
        return "Node=" +this.data;
    }
}
//***************************************************************************//

//***************************************************************************//
public class LinkedList {

    //attributes
    private Node head;

    //constructors
    public LinkedList(){
        this.head = null;
    }

    //methods
    // which methods do we need?
    // 1st addToHead

    public void addToHead(int _data){

        Node _new_node = new Node(_data);

        if(this.head == null){
            this.head = _new_node;
        } else {
            _new_node.setNext(_new_node);
            this.head = _new_node;
        }

    }



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
//***************************************************************************//