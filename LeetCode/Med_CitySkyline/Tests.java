package LeetCode.Med_CitySkyline;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Tests {





    @Test
    public void testThisThing(){

        int[][] myArray = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};


        Assert.assertEquals(35, Solution.maxIncreaseKeepingSkyline(myArray));
    }
}
