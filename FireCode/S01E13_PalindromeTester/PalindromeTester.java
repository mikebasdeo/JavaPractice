/**
 * A palindrome is a string or sequence of characters that reads the same backward as forward.
 * For example, "madam" is a palindrome. Write a method that takes in a String and returns
 * a boolean -> true if the input String is a palindrome and false if it is not. An empty string
 * and a null input are considered palindromes. You also need to account for the space character.
 * For example, "race car" should return false as read backward it is "rac ecar".
 * */
package FireCode.S01E13_PalindromeTester;

public class PalindromeTester {

    public static boolean isStringPalindrome(String str){

        boolean answer = true;

        for(int i = 0; i < str.length(); i++){
            if(i < str.length()-i){

                Character leftChar = str.charAt(i);
                Character rightChar = str.charAt(str.length()-1-i);
                System.out.print("(" + leftChar + " , "+ rightChar + ")");
                if(leftChar.equals(rightChar)){
                    continue;
                } else {
                    answer = false;
                }
            }
        }

        return answer;
    }


    public static void main (String[] args){

        String testString = "racecarr";

        System.out.println(isStringPalindrome(testString));
    }
}
