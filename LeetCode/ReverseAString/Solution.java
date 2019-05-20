/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the
 * input array in-place with O(1) extra memory.You may assume all the characters consist of printable
 * ascii characters.

 Example:

 Input: ["h","e","l","l","o"]
 Output: ["o","l","l","e","h"]
 Example 2:

 Input: ["H","a","n","n","a","h"]
 Output: ["h","a","n","n","a","H"]*/

package LeetCode.ReverseAString;

public class Solution {

    public static char[] reverseString(char[] s) {

        int front = 0;
        while(front < (s.length-1)-front){

            if(front == ((s.length-1)-front)){
                return s;
            }
            char tempChar = s[front];
            s[front] = s[((s.length-1)-front)];
            s[((s.length-1)-front)] = tempChar;
            front++;
        }
        return s;
    }
}
