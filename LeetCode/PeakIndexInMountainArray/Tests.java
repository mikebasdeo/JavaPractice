package LeetCode.PeakIndexInMountainArray;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

    //make an array and send it


    @Test
    public void MountainTest(){

        int[] testArray = {0,2,1,0,1,2,3,4,5};
        Assert.assertEquals(1, Solution.peakIndexInMountainArray(testArray));

        int[] testArray2 = {0,1,0};
        Assert.assertEquals(1, Solution.peakIndexInMountainArray(testArray2));

        int[] testArray3 = {0,1,1,0,1,2,3,4,5,4};
        Assert.assertEquals(8, Solution.peakIndexInMountainArray(testArray3));
    }

}
