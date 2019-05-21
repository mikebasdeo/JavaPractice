package LeetCode.MaxDepthOfTree;
import org.junit.Assert;
import org.junit.Test;


public class Tests {

    @Test
    public void MaxDepthOfTreeTests(){

        // This should return a depth of 4
        TreeNode testTree = new TreeNode(3);
        testTree.left = new TreeNode(9);
        testTree.right = new TreeNode(20);
        testTree.right.left = new TreeNode(15);
        testTree.right.right = new TreeNode(7);
        testTree.right.left.right = new TreeNode(10);


        TreeNode testTree2 = new TreeNode((1));

        TreeNode testTree3 = null;


        Assert.assertEquals(4, Solution.maxDepth(testTree));
        Assert.assertEquals(1, Solution.maxDepth(testTree2));
        Assert.assertEquals(0, Solution.maxDepth(testTree3));

        //Assert.assertEquals(1, Solution.maxDepth(testTree2));

    }


}
