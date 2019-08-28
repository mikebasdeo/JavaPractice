package Misc.IBM;

import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Array;

public class Tests {

    @Test
    public void IBM(){

        String myString1 = "HackerRank";
        String myString2 = "Monday";
        Assert.assertEquals(3, Solution.testMethod(myString1, myString2));
    }


}
