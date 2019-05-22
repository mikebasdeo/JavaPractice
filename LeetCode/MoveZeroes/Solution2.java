package LeetCode.MoveZeroes;

import java.util.Arrays;

public class Solution2 {

    public static int[] moveZeroes(int[] nums){
        int insertPosition = 0;
        // Step 1 - shift non-zero values forward (sneaky fuck!)
        for (int num: nums){
            if(num != 0){
                nums[insertPosition++] = num;
            }
        }
        // Step 2 - insertPosition now has all the non-zero moves.
        // So we can start adding 0's at the end from where it ended.
        while(insertPosition < nums.length){
            nums[insertPosition++] = 0;
        }
        return nums;
    }
}


