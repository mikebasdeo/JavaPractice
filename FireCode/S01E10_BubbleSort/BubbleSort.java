package FireCode.S01E10_BubbleSort;

import java.util.Arrays;

/**
 * Write a method that takes in an array of ints and uses the Bubble
 * Sort algorithm to sort the array 'in place' in ascending order.
 * The method should return the same, in-place sorted array.

 Note: Bubble sort is one of the most inefficient ways to sort a large array of integers.
 Nevertheless, it is an interview favorite. Bubble sort has a time complexity of O(n2).
 However, if the sample size is small, bubble sort provides a simple implementation of
 a classic sorting algorithm.*/

public class BubbleSort {

    public static int[] bubbleSortArray(int[] arr){
        boolean swapped = true;
        while(swapped == true){
            swapped = false;
            for(int i = 0; i < arr.length -1; i++){
                if(arr[i] > arr[i+1]){
                    int tempVar = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = tempVar;
                    swapped = true;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args){

        int[] myArray = {6,8,9,3,5,7,1,9,0};
        int[] solution = bubbleSortArray(myArray);
        System.out.println(Arrays.toString(solution));

    }


}
