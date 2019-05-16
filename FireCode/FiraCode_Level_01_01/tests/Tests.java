package FireCode.FiraCode_Level_01_01.tests;
import FireCode.FiraCode_Level_01_01.solutions.BinarySearch;
import org.junit.Assert;
import org.junit.Test;



public class Tests {

    @Test
    public void binarySearchTest(){
        int[] arrayToTest = {2,4,6,8,10,12,14,16,18,20};
        int left = 0;
        int right = arrayToTest.length;
        Assert.assertTrue(BinarySearch.binarySearch(arrayToTest, 4, left, right));
        Assert.assertTrue(BinarySearch.binarySearch(arrayToTest, 2, left, right));
        Assert.assertFalse(BinarySearch.binarySearch(arrayToTest, 1, left, right));
        Assert.assertFalse(BinarySearch.binarySearch(arrayToTest, 21, left, right));
    }
}







