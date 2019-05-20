package LeetCode.JewlesAndStones;
import org.junit.Assert;
import org.junit.Test;


public class JewelsAndStonesTest {

    @Test
    public void JewelsAndStones(){
        Assert.assertEquals(3,JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0,JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}







