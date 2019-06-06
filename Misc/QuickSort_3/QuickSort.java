package Misc.QuickSort_3;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void quickSort(int[] myArray){
        quickSort(myArray, 0, myArray.length-1);
    }

    public static void quickSort(int[] myArray, int left, int right){

        if(left < right){
            int pivot = partition(myArray, left, right);
            quickSort(myArray, left, pivot-1);
            quickSort(myArray, pivot+1, right);
        }
    }

    public static int getPivot(int left, int right){
        Random rand = new Random();
        int pivot = rand.nextInt((right-left)+1) + left;
        return pivot;
    }

    public static void swap(int[] myArray, int left, int right){
        int temp = myArray[left];
        myArray[left] = myArray[right];
        myArray[right] = temp;
    }

    public static int partition(int[] myArray, int left, int right){

        // get random pivot
        int pivot = getPivot(left, right);
        //swap
        swap(myArray, left, pivot);

        // hard part
        int border = left + 1;

        for(int i = border; i <= right; i++ ){

            if(myArray[i] < myArray[left]){
                swap(myArray, i, border);
                border++;
            }
        }

        // swap back
        swap(myArray, left, border-1);

        return border-1;
    }




    public static void main(String[] args) {
        System.out.println("QuickSort!");
        int[] myArray = {123,65,789,321,453,23,7,12,12,67,9,234,0,0,43,12};
        System.out.println(Arrays.toString(myArray));

        quickSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
