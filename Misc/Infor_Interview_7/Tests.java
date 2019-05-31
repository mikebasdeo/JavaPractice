package Misc.Infor_Interview_7;
import org.junit.Test;
import org.junit.Assert;


public class Tests {
    @Test
    public void InforTreeTest(){

        Node testTree1 = new Node("1");
        testTree1.left = new Node("2");
        testTree1.left.left = new Node("4");

        Node testTree2 = new Node("1");
        testTree2.right = new Node("2");
        testTree2.right.right = new Node("4");

        Assert.assertTrue(Solution.reflected(testTree1, testTree2));
    }
}
