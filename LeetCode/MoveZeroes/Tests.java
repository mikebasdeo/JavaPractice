package LeetCode.MoveZeroes;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


public class Tests {

    @Test
    public void MoveZeroesTest(){

        int[] testArray = {0,1,0,3,12};
        Assert.assertThat(Solution.moveZeroes(testArray), is(new int[] {0,1,0,3,12}));




    }

}
