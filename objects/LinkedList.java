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

    public Node getNext(){
        return this.next;
    }

    @Override
    public String toString() {
        return Integer.toString(this.data);
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
    public void addToHead(int _data){

        Node _new_node = new Node(_data);

        if(this.head == null){
            this.head = _new_node;
        } else {
            _new_node.setNext(this.head);
            this.head = _new_node;
        }

    }



    @Override
    public String toString() {

        String stringToReturn = "";

        while(this.head.getNext() != null){
            stringToReturn = stringToReturn +" "+ this.head.toString();
            this.head = this.head.getNext();

        }
        stringToReturn = stringToReturn +" "+ this.head.toString();

        return stringToReturn;
    }
}
//***************************************************************************//