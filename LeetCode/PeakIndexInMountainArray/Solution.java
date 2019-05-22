package LeetCode.PeakIndexInMountainArray;

import java.util.Arrays;

public class Solution {

    public static boolean checkIfPeak(int left, int middle, int right){
        if(left < middle && right < middle){
            System.out.println("Found A Peak. Time to leave.");
            return true;
        } else {
            return false;
        }
    }

    public static int peakIndexInMountainArray(int[] a){
        System.out.print("Array Recieved: ");
        System.out.println(Arrays.toString(a));

        // lets move through the array
        int position = 0;

        int left;
        int right;
        int middle;

        while(position+2 < a.length){

            left = a[position];
            middle= a[position+1];
            right = a[position+2];

            System.out.println("Checking: " + left + "<" + middle + "<" + right);

            boolean isPeak = checkIfPeak(left, middle, right);
            if(isPeak){
                return position+1;
            }
            position++;
        }

        return -1;
    }

}
