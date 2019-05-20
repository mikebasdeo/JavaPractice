package LeetCode.ReverseAString;
import LeetCode.ReverseAString.Solution.*;
import org.junit.Assert;
import org.junit.Test;


public class Tests {

    @Test
    public void reverseAStringTest(){

        char[] testArray = {'a'};
        char[] expectedOutput = {'a'};

        //Assert.assertEquals(24, Solution.reverseString(testArray));
        Assert.assertArrayEquals(expectedOutput, Solution.reverseString(testArray));

    }
}







