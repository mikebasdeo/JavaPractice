package LeetCode.MinimumAddToMakeParenthesesValid;

/**
 * [STACK - MEDIUM]
 * Given a string S of '(' and ')' parentheses, we add the
 * minimum number of parentheses ( '(' or ')', and in any
 * positions ) so that the resulting parentheses string is valid.
 *
 *
 * Formally, a parentheses string is valid if and only if:
 *      -It is the empty string, or
 *      -It can be written as AB (A concatenated with B), where A and B are valid strings, or
 *      -It can be written as (A), where A is a valid string.
 *
 * Given a parentheses string, return the minimum number of parentheses we must add to make the resulting string valid.
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {

    static Stack<Character> myStack = new Stack<Character>();
    static List<Character> myList = new ArrayList<Character>();


    public static int minAddtoMakeValid(String S){
        createCharacterArray(S);
        //System.out.println(Arrays.toString(myStack.toArray()));
        System.out.println(myList.toString());

        for(Character c : myList){
            if(c == '('){
                myStack.add(c);
            }
            else if(c == ')'){

                if(!myStack.empty() && myStack.peek() == '('){
                    myStack.pop();
                } else {
                    myStack.add(c);
                }
            }
        }
        //System.out.println(Arrays.toString(myStack.toArray()));
        return myStack.size();
    }

    /**
     * For simpler traversal
     * */
    public static void createCharacterArray(String myString){
        System.out.println("Solution.createCharacterArray");

        for(int i = 0; i < myString.length(); i++){
            Character c = myString.charAt(i);
            myList.add(c);
        }

    }

    public static void main(String[] args){

        String myString = "()))((";
        minAddtoMakeValid(myString);



    }


}

