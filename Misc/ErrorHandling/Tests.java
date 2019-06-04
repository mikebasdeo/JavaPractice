package Misc.ErrorHandling;

import org.junit.Test;
import org.junit.Assert;

public class Tests {

    @Test
    public void ErrorHandlingTest(){

        Assert.assertEquals(3, Solution.testErrors(1, 20));
    }

}
