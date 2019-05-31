package Misc.Infor_Interview_3;
import org.junit.Test;
import org.junit.Assert;



public class Tests {

    @Test
    public void Infor_Interview_3_Tests(){

        Assert.assertTrue(Solution.funToMakeSimpler(1,2,3));
        Assert.assertFalse(Solution.funToMakeSimpler(9,9,9));
        Assert.assertTrue(Solution.funToMakeSimpler(1,5,3));
    }
}
