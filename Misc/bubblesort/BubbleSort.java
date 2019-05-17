package Misc.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arrayToSort){

        // test if we have the array, we probably do
        //System.out.println(Arrays.toString(arrayToSort));

        // working iterator

        while(true){
            System.out.println(Arrays.toString(arrayToSort));
            boolean swapped = false;

            for(int i = 0; i < (arrayToSort.length) -1 ; i++){
                if(arrayToSort[i] > arrayToSort[i+1]){
                    //swap
                    // maybe do this more gooder?
                    int tempValue = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+1];
                    arrayToSort[i+1] = tempValue;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }


        // here's where the magic happens
//        while(true){
//            boolean swapped = false;
//            //traverse the list
//
//
//
//        }





    }

    public static void main(String[] args){

        // array for testing
        // TODO make better testing array
        int[] myArray = {3,7,5,9,12,2,9};

        // send to method for sorting, maybe don't need the variable here.
        //int[] sortedArray = bubbleSort(myArray);
        bubbleSort(myArray);

        //System.out.println(Arrays.toString(sortedArray));





    }
}
