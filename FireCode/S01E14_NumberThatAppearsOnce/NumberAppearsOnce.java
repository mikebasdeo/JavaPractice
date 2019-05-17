/**
 * Write a method that returns a number that appears only once in an array.
 Assume the array will surely have a unique value. The array will never be empty.
 * */

package FireCode.S01E14_NumberThatAppearsOnce;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearsOnce {

    public static int singleNumber(int[] A){

        int answer = 0;

        //create a Hashmap
        Map<Integer, Integer> myDictionary = new HashMap<Integer, Integer>();

        //loop through the array and print each value
        for(int i = 0; i < A.length; i++ ){
            //System.out.println(A[i]);

            //if its not in the dict, put it. else, add to the value
            if(myDictionary.containsKey(A[i])){
                myDictionary.put(A[i], myDictionary.get(A[i])+1);
            } else {
                myDictionary.put(A[i], 1);
            }
        }

        // now lets look at the dictionary
        for(int key: myDictionary.keySet()){
            System.out.print("(" + key+ "->" + myDictionary.get(key) + ")");

            if(myDictionary.get(key) == 1){
                answer = key;
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args){

        int[] A = {3,6,8,0,3,6,0,3};

        System.out.println("\n" + singleNumber(A));

    }

}
