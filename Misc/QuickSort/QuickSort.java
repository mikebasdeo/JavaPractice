package Misc.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public void quickSort(int[] A){
        quickSort(A, 0, A.length-1);
    }

    private void quickSort(int[] A, int low, int high){

        //if there is more than 1 thing left in between our pointers
        if(low < high+1){
            int pivot = partition(A, low, high);
            quickSort(A, low, pivot-1);
            quickSort(A, pivot+1, high);
        }
    }

    private void swap(int[] A, int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;

    }

    //returns random pivot index between low and high
    private int getPivot( int low, int high){
        Random rand = new Random();
        return rand.nextInt((high-low) +1) + low;
    }

    private int partition(int[] A, int low, int high){

        // place pivot value in leftmost position (low)
        swap(A, low, getPivot(low, high));
        int border = low + 1;
        for(int i = border; i <= high; i++){
            if(A[i] < A[low]){
                swap(A, i, border++);
            }
        }
        // place pivot in correct position
        swap(A, low, border-1);
        //return index of pivot value
        return border-1;
    }

    public static void main (String[] args){
        System.out.println("QuickSort");
        QuickSort qs = new QuickSort();
        int[] A = {9,0,1,3,4,5,2,9,8,7,6,5,9,1,0,9};
        System.out.println(Arrays.toString(A));
        qs.quickSort(A);
        System.out.println(Arrays.toString(A));

    }

}
