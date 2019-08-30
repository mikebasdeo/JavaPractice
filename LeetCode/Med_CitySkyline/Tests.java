package LeetCode.Med_CitySkyline;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Tests {





    @Test
    public void testThisThing(){

        int[][] myArray = {{3,0,8,4,1},{2,4,5,7,1},{9,2,6,3,1},{0,3,1,0,1}};


        Assert.assertEquals(69, Solution.maxIncreaseKeepingSkyline(myArray));
    }
}
