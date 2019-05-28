/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

package LeetCode.TwoSum;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){

        int[] answer = new int[2];


        //dictionary
        HashMap<Integer, Integer> myDict = new HashMap<Integer, Integer>();

        // loop through the array and print the value for testing
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");

            // who is my friend?
            int friend = target - nums[i];
            System.out.println("My Friend is "+ friend);

            //have I seen my friend earlier?
            if(myDict.containsKey(friend)){
                // yes I have! but where?
                answer[0] = myDict.get(friend);
                answer[1] = i;

            } else {
                // no I haven't
                myDict.put(nums[i], i);

            }
        }

        return answer;

    }

    public static void main (String[] args){
        System.out.println("Hello from TwoSum");

        int[] testArray = {2,7,11,15};
        int target = 9;

        int[] answer = twoSum(testArray, target);

        System.out.println(Arrays.toString(answer));

    }
}
