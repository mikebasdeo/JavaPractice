/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 The letters in J are guaranteed distinct, and all characters in J and S are letters.
 Letters are case sensitive, so "a" is considered a different type of stone from "A".

 Example 1:

 Input: J = "aA", S = "aAAbbbb"
 Output: 3
 Example 2:

 Input: J = "z", S = "ZZ"
 Output: 0
 Note:

 S and J will consist of letters and have length at most 50.
 The characters in J are distinct.
 * */

package LeetCode.JewlesAndStones;
import java.util.HashMap;
import java.util.Map;


public class JewelsAndStones {

    public static int numJewelsInStones( String J, String S){

        // tools
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        Map<Character, Integer> myDict = new HashMap<Character, Integer>();
        int totalJems = 0;


        // work
        //Step 1: traverse the jewels and create dictionary entries for each jewel and set them to 0.
        for(char jewel: jewels){
            myDict.put(jewel,0);
        }

        // Step 2: traverse the stones and add +1 if they are in the dictionary
        for(char stone: stones){
            if(myDict.containsKey(stone)){
                myDict.put(stone, myDict.get(stone) + 1);
            }
        }

        // Step 3: Add up everything in the dictionary
        for(char stone: myDict.keySet()){
            totalJems = totalJems + myDict.get(stone);
        }
        return totalJems;

    }
}
