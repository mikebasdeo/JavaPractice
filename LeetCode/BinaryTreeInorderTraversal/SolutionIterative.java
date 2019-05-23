package LeetCode.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class SolutionIterative {


    public static List<Integer> inOrderTraversal2(TreeNode root){

        // ingredients
        List<Integer> myList = new ArrayList<Integer>();
        Stack<TreeNode> myStack = new Stack<TreeNode>();
        TreeNode currentNode = root;


        // recipe
        while(currentNode != null || !myStack.empty()){

            // go all the way left
            while(currentNode != null){
                myStack.add(currentNode);
                currentNode = currentNode.left;
            }

            // can't go any more left, then process the node
            currentNode = myStack.pop();
            myList.add(currentNode.val);

            // right
            currentNode = currentNode.right;
        }
        return myList;
    }


}
