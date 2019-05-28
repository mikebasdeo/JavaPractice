package LeetCode.MajorityElement;
import org.junit.Test;
import org.junit.Assert;

public class Tests {

    @Test
    public void MajorityElementTest(){

        int[] testArray = {-1, 100, 2, 100, 100, 4, 100};

        Assert.assertEquals(100,Solution.majorityElement(testArray));

    }

}
