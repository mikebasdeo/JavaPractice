/**
 * Given an unsorted array of n elements.
 *
 * */

package Misc.IBM;

public class Solution {

    static StringBuilder sb =new StringBuilder("");

    public static int testMethod(String a, String b){

//        for(int i = 0; i < string1.length(); i++){
//            char c = string1.charAt(i);
//            System.out.println(c);
//        }

        int s1 = a.length();
        int s2 = b.length();

        for(int i = 0; i < s1+s2; i++){

            if(i < s1 && i < s2){
                // add one char from each
                sb.append(a.charAt(i));
                sb.append(b.charAt(i));
            }
            if(i < s1 && i >= s2){
                sb.append(a.charAt(i));
            }

            if(i >= s1 && i < s2){
                sb.append(b.charAt(i));
            }

        }


        System.out.println(sb.toString());


        return 3;
    }


    public static void main(String[] args){
        System.out.println("Test");
    }

}
