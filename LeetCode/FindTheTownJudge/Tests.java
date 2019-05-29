package LeetCode.FindTheTownJudge;

import org.junit.Test;
import org.junit.Assert;


public class Tests {

    @Test
    public void TownJudgeTest(){

        // [row][column]
        int[][] testArray = {
                { 1, 3 },
                { 1, 4 },
                { 2, 3 },
                { 2, 4 },
                { 4, 3 }
        };
        Assert.assertEquals(3, Solution.findJudge(4, testArray));

        int[][] testArray2 = {

                {1,2},
                {2,3},
        };

        Assert.assertEquals(-1, Solution.findJudge(3, testArray2));



    }

}
