/**
 * Insert Something at the end of a Linked List
 * */

package FiraCode_Level_01_04.solutions;

class ListNode {
    int data;
    ListNode next;
    ListNode(int data) { this.data = data; }
}

public class LinkedListInsert {

    public static void main (String[] args){
        //test input
        ListNode myNode = new ListNode(4);
    }

    public static void insertAtTail(ListNode head, int data){

        ListNode currentNode = head;
        //given the head
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        // do stuff here
        currentNode.next = new ListNode(data);

    }


}
