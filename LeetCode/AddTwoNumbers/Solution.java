
/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.You may assume the two numbers do
 * not contain any leading zero, except the number 0 itself.
 * */

package LeetCode.AddTwoNumbers;


class ListNode {
    // attributes
    int val;
    ListNode next;
    // constructor
    ListNode(int x){
        val = x;
    }
    // methods
    public void printEntireList(ListNode head){
        while(head.next != null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.print(head.val + "\n");
    }
}


public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){


        /*
        Create a new LL to store the answer.
        We have to initialize the list with something,
        so lets use a dummy number and skip it at the end.
        */
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;

        int currVal_l1 = 0;
        int currVal_l2 = 0;
        int carry = 0;

        /*
        this clever loop handles LL's of different sizes, and the final carry over
        if the result LL is larger than the input LL.
        */
        while(l1 != null || l2 != null || carry != 0){


            currVal_l1 = (l1 != null ? l1.val : 0);
            currVal_l2 = (l2 != null ? l2.val: 0);

            // add the two current values, along with the carry value from the previous looping
            int currTotal = currVal_l1 + currVal_l2 + carry;

            // update carry value for use in the next position
            carry = currTotal / 10;

            // add the 1's digit to our result LL and step forward.
            dummy.next = new ListNode(currTotal % 10);
            dummy = dummy.next;



            // the linked lists may not be the same size, so check both before looping over and moving.
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        return dummy.next;
    }
}
