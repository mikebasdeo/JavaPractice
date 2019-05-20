package LeetCode.AddTwoNumbers;
import org.junit.Assert;
import org.junit.Test;


public class Tests {

    @Test
    public void addTwoNumbersTest(){

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l1.printNode();
        l2.printNode();
        Assert.assertEquals(l1, Solution.addTwoNumbers(l1, l2));

//        Assert.assertTrue(BinarySearch.binarySearch(arrayToTest, 4, left, right));
//        Assert.assertTrue(BinarySearch.binarySearch(arrayToTest, 2, left, right));
//        Assert.assertFalse(BinarySearch.binarySearch(arrayToTest, 1, left, right));
//        Assert.assertFalse(BinarySearch.binarySearch(arrayToTest, 21, left, right));
    }
}







