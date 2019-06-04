package Misc.quicksort;

import java.util.Arrays;

/**
 * - In most situations, quicksort is the fastest algorithm
 * - Partition the array and recursively split into 'smaller < pivot < bigger'
 * @author: Mike
 * @version: 1.0
 * */
public class Partitioning {

    // attributes
    private static int[] theArray;
    private static int arraySize;

    // constructors
    Partitioning(int newArraySize){
        arraySize = newArraySize;
        theArray = new int[arraySize];
        generateRandomArray();

    }

    // methods
    public void generateRandomArray(){
        for (int i = 0; i < arraySize; i++){
            theArray[i] = (int)(Math.random() * 10);
        }
    }

    // quicksort
    public void partitionArray(int pivot){
        int leftPos = -1;
        int rightPos = arraySize;
        while(true){

            // move in left pointer
            while(leftPos < (arraySize-1) && theArray[++leftPos] < pivot){
                System.out.println("Left Pivot -> to " + theArray[leftPos]);
                continue;

            }

            //move in right pointer
            while(rightPos > 0 && theArray[--rightPos] > pivot){
                System.out.println("Right Pivot <- to " + theArray[rightPos]);
                continue;
            }




            if(leftPos >= rightPos){
                break;
            } else {
                //swap
                System.out.println("Swapping " + theArray[leftPos] + " with " + theArray[rightPos]);
                int temp = theArray[leftPos];
                theArray[leftPos] = theArray[rightPos];
                theArray[rightPos] = temp;
                System.out.println(Arrays.toString(theArray));
            }
        }

    }

    public static void main (String[] args){
        System.out.println("QuickSort");
        Partitioning myList = new Partitioning(10);
        System.out.println(Arrays.toString(myList.theArray));
        myList.partitionArray(5);
        System.out.println(Arrays.toString(myList.theArray));
    }

}
