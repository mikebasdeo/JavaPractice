package Misc.Infor_Interview_7;

class Node{
    Node left;
    Node right;
    String value;

    Node(String value){
        this.value = value;
    }
}

public class Solution {

    public static boolean reflected(Node tree1, Node tree2){

        // Edge Case #1
        if(tree1 == null && tree2 == null){
            return true;
        }
        // Edge case #2
        if(tree1 == null || tree2 == null ){
            return false;
        }
        if(tree1.value.equals(tree2.value)){
            return true && reflected(tree1.left, tree2.right) && reflected(tree1.right, tree2.left);
        }
        return false;

    }
}
