/**
 * Given a binary tree, find its maximum depth.
 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 Note: A leaf is a node with no children.

 Example:

 Given binary tree [3,9,20,null,null,15,7],
 * */

package LeetCode.MaxDepthOfTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class Solution {

    //attributes
    public static int currentMax = 0;

    public static void checkIfNewMax(int newMax){
        if(newMax > currentMax){
            currentMax = newMax;
        }
    }

    public static int maxDepth(TreeNode root){
        currentMax = 0;

        if(root == null){
            return 0;
        }
        recursiveEndOfTree(root, 1);
        return currentMax;
    }

    public static int recursiveEndOfTree(TreeNode currentNode, int counter){

        //base case
        if(currentNode.left == null && currentNode.right == null){
            checkIfNewMax(counter);
            return 1;
        }

        // recursive step.
        //TODO : Do This nicer?
        if(currentNode.left != null && currentNode.right != null){
            counter = recursiveEndOfTree(currentNode.left, counter+1) + recursiveEndOfTree(currentNode.right, counter+1);
        } else if(currentNode.left == null){
            counter = recursiveEndOfTree(currentNode.right, counter+1);
        } else {
            counter = recursiveEndOfTree(currentNode.left, counter+1);
        }
        return counter;
    }


}
