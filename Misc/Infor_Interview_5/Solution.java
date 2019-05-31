package Misc.Infor_Interview_5;
/*
* Improve the following method as much as possible (preserving the function name and the inputs)
Ensure that it returns true if and only if both arrays contain the given value.
Note: The lists may be null and may contain null values.
* */

import java.util.*;

public class Solution {

    public static boolean isInBoth(String value, List<String> array1, List<String> array2) {

        //try to convert to Array for real
        String[] arrayA = array1.toArray(new String[array1.size()]);
        String[] arrayB = array2.toArray(new String[array2.size()]);

        //Lets make a Dictionary
        Map<String, Integer> myDict = new HashMap<String, Integer>();

        for(String entry: arrayA){
            if(entry == value){
                myDict.put(entry, 1);
            }
        }
        for(String entry: arrayB){
            if(entry == value && myDict.containsKey(entry)){
                return true;
            }
        }
        return false;
    }


}
