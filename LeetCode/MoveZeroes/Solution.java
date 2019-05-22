/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 Example:

 Input: [0,1,0,3,12]
 Output: [1,3,12,0,0]
 Note:

 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.*/

package LeetCode.MoveZeroes;

import java.util.Arrays;

public class Solution {

    public static int[] moveZeroes(int[] nums){
        int counter = 0;
        boolean swapped = true;

        while(swapped == true){
            counter++;
            swapped = false;
            for(int i = 0; i < nums.length-counter; i++){
                if(nums[i] == 0){
                    swapped = true;
                    nums[i] = nums[i+1];
                    nums[i+1] = 0;
                }
            }
        }
        return nums;
    }
}
