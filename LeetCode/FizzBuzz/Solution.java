package LeetCode.FizzBuzz;
import java.util.*;

public class Solution {

    public static List<String> fizzBuzz(int n){

        List<String> myList = new ArrayList<String>();

        // put everything int the list and print it.
        for(int i = 1; i < n+1; i++){

            String fizz= "";
            String buzz = "";
            String stringToAdd="";

            fizz= fizz.concat((i % 3 == 0) ? "Fizz": "");
            buzz= buzz.concat((i % 5 == 0) ? "Buzz": "");
            stringToAdd = fizz.concat(buzz);

            if(stringToAdd != ""){
                myList.add(stringToAdd);
            } else {
                myList.add(Integer.toString(i));
            }
        }
        return myList;
    }
}
