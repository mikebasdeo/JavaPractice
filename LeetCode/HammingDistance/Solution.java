package LeetCode.HammingDistance;

public class Solution {

    public static int hammingDistance(int x, int y){

        String myString = Integer.toBinaryString(x^y);

        int counter = 0;
        for(int i= 0; i < myString.length(); i++){
            if(myString.charAt(i) == '1'){
                counter++;
            }
        }
        return counter;
    }
}
