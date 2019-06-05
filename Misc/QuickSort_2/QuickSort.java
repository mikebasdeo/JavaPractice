package Misc.QuickSort_2;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] myArray){
        quickSort(myArray, 0, myArray.length-1);
    }
    public static void swap(int[] myArray, int index1, int index2){
        System.out.println("      QuickSort.swap");
        System.out.println("        "+Arrays.toString(myArray));
        int temp = myArray[index1];
        myArray[index1] = myArray[index2];
        myArray[index2] = temp;
        System.out.println("        "+Arrays.toString(myArray));
    }


    public static void quickSort(int[] myArray, int left, int right){
        System.out.print("QuickSort.quickSort");
        System.out.println("myArray = [" + Arrays.toString(myArray) + "], leftPos = [" + left + "], rightPos = [" + right + "]");
        // don't let the pointers pass each other
        if(left < right){
            int pivot = partition(myArray, left, right);
            quickSort(myArray, left, pivot-1);
            quickSort(myArray, pivot+1, right);
        }
    }


    /**
     * GetPivot
     * Randomly selects a position within our current pointer boundaries
     * to be used as the pivot point for this iteration of the quicksort.
     * */
    public static int getPivot(int left, int right){
        System.out.print("      QuickSort.getPivot:");
        System.out.print("left = [" + left + "], right = [" + right + "]");
        Random rand = new Random();
        int pivot = rand.nextInt((right-left) + 1) + left;
        System.out.println(" pivot chosen: " + pivot);
        return pivot;
    }


    public static int partition(int[] arrayChunk, int left, int right){
        System.out.print("    QuickSort.partition");
        System.out.println(Arrays.toString(arrayChunk));
        // find a pivot place in leftmost position.
        int pivot = getPivot(left, right);
        swap(arrayChunk, left, pivot);

        //hard part
        // exclude pivot from loop
        int border = left + 1;
        for(int i = border; i <= right; i++){
            if(arrayChunk[i] < arrayChunk[left]){
                swap(arrayChunk, i,  border);
                border++;
            }
        }
        // place pivot in final spot
        swap(arrayChunk, left, border-1);
        return border-1;
    }
    public static void main (String[] args){
        System.out.println("Hello Quicksort!!");
        int[] myArray = {9,0,1,3,4,5,2,9,8,7,6,5,9,1,0,9};

        quickSort(myArray);
    }

}
