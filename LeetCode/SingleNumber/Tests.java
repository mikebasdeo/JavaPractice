package LeetCode.SingleNumber;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void SingleNumberTest(){
        int[] testNums = {4,1,2,1,2};
        int[] testNums2 = {2,2,1};

        Assert.assertEquals(4, Solution.singleNumber(testNums));
        Assert.assertEquals(1, Solution.singleNumber(testNums2));

    }
    @Test
    public void SingleNumberTest_2(){
        int[] testNums = {4,1,2,1,2};
        int[] testNums2 = {2,2,1};
        Assert.assertEquals(4, Solution.singleNumber(testNums));
        Assert.assertEquals(1, Solution.singleNumber(testNums2));
    }
}
