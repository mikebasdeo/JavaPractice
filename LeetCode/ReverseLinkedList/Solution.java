package LeetCode.ReverseLinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }
}


public class Solution {

    public static ListNode reverseList(ListNode head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        //Need three pointers to do this
        ListNode prev = head;
        ListNode current = prev.next;
        ListNode next = current.next;

        // Step 1 - Take one manual step before looping. Make sure old head has no next.
        current.next = prev;
        prev.next = null;

        // Step 2 - Loop through and do something
        while (next != null){
            // Move everyone one forward
            prev = current;
            current = next;
            next = next.next;
            // This is all we need!
            current.next = prev;
        }
        head = current;
        return head;
    }
}
