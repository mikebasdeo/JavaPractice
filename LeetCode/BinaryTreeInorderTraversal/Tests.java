package LeetCode.BinaryTreeInorderTraversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static LeetCode.BinaryTreeInorderTraversal.SolutionRecursive.inOrderTraversal;
import static LeetCode.BinaryTreeInorderTraversal.SolutionIterative.inOrderTraversal2;
import static org.hamcrest.CoreMatchers.is;


public class Tests {

    @Test
    public void BinaryTreeInOrderTraversalTest(){

        TreeNode testTree = new TreeNode(1);
        testTree.left = null;
        testTree.right = new TreeNode((2));
        testTree.right.left = new TreeNode((3));


        List<Integer> expected = Arrays.asList(1, 3, 2);
        Assert.assertThat(inOrderTraversal(testTree), is(expected));
        Assert.assertThat(inOrderTraversal2(testTree), is(expected));

    }
}
