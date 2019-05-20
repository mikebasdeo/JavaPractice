package LeetCode.AddTwoNumbers;
import org.junit.Assert;
import org.junit.Test;


public class Tests {

    @Test
    public void addTwoNumbersTest(){

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(5);

        Assert.assertEquals(24, Solution.addTwoNumbers(l1, l2));

        Assert.assertEquals(10, Solution.addTwoNumbers(l1, l2));
    }
}







