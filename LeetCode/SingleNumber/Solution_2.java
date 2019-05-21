package LeetCode.SingleNumber;



public class Solution_2 {
    public static int singleNumber(int[] nums){
        int answer = 0;
        for(int i = 0; i < nums.length; i++){
            answer ^= nums[i];
        }
        return answer;
    }
}
