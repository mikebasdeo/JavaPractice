/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * */

package LeetCode.MajorityElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int majorityElement(int[] nums){

        Map<Integer, Integer> myDict = new HashMap<Integer, Integer>();
        int arraySize = nums.length;
        int solution = 0;

        // dictionary populating
        for(int i = 0; i < arraySize; i++){
            if(myDict.containsKey(nums[i])){
                myDict.put(nums[i], myDict.get(nums[i])+1);
            } else{
                myDict.put(nums[i], 1);
            }

            // early stop here
            if(myDict.get(nums[i]) > arraySize/2 ){
                solution = nums[i];
                break;

            }
        }

        // lets check whats in the dictionary.
        System.out.println(Arrays.asList(myDict));
        System.out.println("The answer is " + solution);

    return solution;
    }
}
