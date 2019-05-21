package LeetCode.SingleNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int singleNumber(int[] nums){
        int answer;
        Map<Integer, Integer> myDict = new HashMap<Integer, Integer>();
        myDict = populateDictionary(myDict, nums);
        answer = findTheSingleOne(myDict);
        return answer;
    }

    public static int findTheSingleOne(Map<Integer, Integer> myDict){
        for(Integer key: myDict.keySet()){
            if(myDict.get(key) == 1){
                return key;
            }
        }
        return -1;
    }

    public static Map<Integer, Integer> populateDictionary(Map<Integer, Integer> myDict, int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(myDict.containsKey(nums[i])){
                myDict.put(nums[i], myDict.get(nums[i])+1);
            } else{
                myDict.put(nums[i], 1);
            }
        }
        return myDict;
    }

}
