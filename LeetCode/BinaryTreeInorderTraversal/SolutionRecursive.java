/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
    Follow up: Recursive solution is trivial, could you do it iteratively?
 * */

package LeetCode.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class SolutionRecursive {

    //static List<Integer> myList = new ArrayList<Integer>();

    public static List<Integer> inOrderTraversal(TreeNode root){

        List<Integer> myList = new ArrayList<Integer>();
        recursion(root, myList);
        return myList;
    }

    public static void recursion(TreeNode current, List<Integer> myList){

        if(current != null){
            recursion(current.left, myList);
            myList.add(current.val);
            recursion(current.right, myList);
        }

    }


}
