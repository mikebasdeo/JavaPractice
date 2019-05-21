package LeetCode.MaxDepthOfTree;

import javafx.scene.layout.Priority;
import java.util.*;

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
        System.out.println("CM: " + currentMax + "    -->  NM: "+ newMax);
        if(newMax > currentMax){
            currentMax = newMax;
        }

    }




    public static int maxDepth(TreeNode root){
        currentMax = 0;

        TreeNode head = root;

        if(root == null){
            return 0;
        }

        int returnedValue = recursiveEndOfTree(head, 1);
        System.out.println("Returned Value: " + returnedValue);

        return currentMax;
    }

    public static int recursiveEndOfTree(TreeNode currentNode, int counter){

        System.out.println("Current Node Value: " + currentNode.val + "   -->   Counter:" + counter);


        //base case
        if(currentNode.left == null && currentNode.right == null){
            System.out.println("Leaf: "+ currentNode.val);

            checkIfNewMax(counter);
            return 1;
        }

        if(currentNode.left == null){

        }

        if(currentNode.left != null && currentNode.right != null){
            counter = recursiveEndOfTree(currentNode.left, counter+1) + recursiveEndOfTree(currentNode.right, counter+1);
        } else if(currentNode.left == null){
            counter = recursiveEndOfTree(currentNode.right, counter+1);
        } else {
            counter = recursiveEndOfTree(currentNode.left, counter+1);
        }



        //counter = recursiveEndOfTree(currentNode.left, counter) + recursiveEndOfTree(currentNode.right, counter);
        return counter;
    }


}
