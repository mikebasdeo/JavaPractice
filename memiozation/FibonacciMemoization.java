/**
 * Recursive Fibonacci using Memoization
 * */
package memiozation;

import java.util.Arrays;

public class FibonacciMemoization {


    // This fucker is the memory of everything we've seen.
    // If the position is not 0, then we've seen it before so don't recalculate.
    public static long fibArray[] = new long[26];



    public static long calculateFibonacci(int n){

        //answer to return
        long answer;

        // base case.
        if(n == 0){ return 0; } else if (n == 1){return 1; }

        // First check for value in memory
        if(fibArray[n] != 0){
            answer = fibArray[n];
        }
        // If its not in memory, then recurse.
        else {
            answer = calculateFibonacci(n-1) + calculateFibonacci(n-2);

            // also update the memory here.
            fibArray[n] = answer;
        }
        return answer;
    }



    public static void main(String[] args){

        System.out.println("Hello!");


        // memory is initialized to all 0's. Use this for testing.
        System.out.println(Arrays.toString(fibArray));
        System.out.println(calculateFibonacci(8));

        // check the value of the memory
        System.out.println(Arrays.toString(fibArray));



    }

}
