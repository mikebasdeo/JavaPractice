package Misc.GCD;
// Find the Misc.GCD of two numbers. Basic recursion.

public class Solution {

    public static void gcd(int x, int y){

        // base case
        if(x == y){
            System.out.println(x);
        } else{
            // Lets find the max and min
            int testMax = Math.max(x, y);
            int testMin = Math.min(x, y);

            //recursion bitch!
            gcd(testMax-testMin, testMin);
        }
    }

    public static void main (String[] args){

        gcd(14, 21);
        ;
    }
}
