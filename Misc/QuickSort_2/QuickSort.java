package Misc.QuickSort_2;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] myArray){
        quickSort(myArray, 0, myArray.length-1);
    }
    public void swap(int[] myArray, int index1, int index2){
        int temp = myArray[index1];
        myArray[index1] = myArray[index2];
        myArray[index2] = temp;
    }


    public static void quickSort(int[] myArray, int leftPos, int rightPos){
        System.out.print("QuickSort.quickSort");
        System.out.print(Arrays.toString(myArray));
        System.out.print("  Array Length: " + myArray.length);
        System.out.print("  LeftPos: " + leftPos);
        System.out.println("  RightPos: " + rightPos);
        // don't let the pointers pass each other
        if(leftPos < rightPos+1){

            int pivot = partition(myArray, leftPos, rightPos);
            // Step 2 - recursion
        }
    }

    public int getPivot(int left, int right){
        Random rand = new Random();
        System.out.println(rand);
        return 0;
    }


    public static int partition(int[] arrayChunk, int leftPos, int rightPos){
        System.out.println("QuickSort.partition");

        // find a pivot place pivot in leftmost position.

        return 0;

    }
    public static void main (String[] args){
        System.out.println("Hello Quicksort!!");
        int[] myArray = {9,0,1,3,4,5,2,9,8,7,6,5,9,1,0,9};

        quickSort(myArray);
        //System.out.println(Arrays.toString(myArray));



    }

}
