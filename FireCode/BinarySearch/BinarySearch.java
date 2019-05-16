package FireCode.BinarySearch;

import java.util.Arrays;

public class BinarySearch {

    public static Boolean binarySearch(int[] arr, int n){

        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length-1;


        // don't let the pointers go past each other
        while(left <= right){

            // System.out.println("What is the array we have?");
            System.out.println("(" + left + "," + right + ")");

            // find middle number

            int middlePosition = left + ((right - left)/2);
            System.out.println(middlePosition);
            System.out.println("Is " + n + " bigger or smaller than " + arr[middlePosition]);

            if(n == arr[middlePosition]){

                return true;
            }
            if(n < arr[middlePosition]){
                right = middlePosition - 1;
            }
            if(n > arr[middlePosition]){
                left = middlePosition + 1;
            }




        }
        return false;


    }

    public static void main (String[] args){

        // terrible
        int[] testArray = {2,4,6,8,10,12,14,16,18,20};

        System.out.println(binarySearch(testArray, 21));


    }
}
