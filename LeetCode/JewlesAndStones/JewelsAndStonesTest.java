package LeetCode.JewlesAndStones;
import FireCode.FiraCode_Level_01_01.solutions.BinarySearch;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import LeetCode.JewlesAndStones.JewelsAndStones.*;
import org.junit.Test;


public class JewelsAndStonesTest {

    @Test
    public void JewelsAndStones(){
        Assert.assertEquals(3,JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0,JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}







