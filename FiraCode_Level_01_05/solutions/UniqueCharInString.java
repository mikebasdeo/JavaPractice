package FiraCode_Level_01_05.solutions;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharInString {

    public static boolean areAllCharactersUnique(String str){

        //edge case - null input
        if(str == null){
            return true;
        }
        boolean answer = true;
        //best way to make a dictionary in Java
        Map<Character, Integer> myDictionary = new HashMap<Character, Integer>();

        //iterate through the string
        for(int i = 0; i < str.length(); i++){
            // get each character
            char currentCharacter = str.charAt(i);

            // either create dictionary entry for the character, or add 1 to the value of said character
            if(myDictionary.containsKey(currentCharacter)){
                myDictionary.put(currentCharacter, myDictionary.get(currentCharacter) + 1);
            } else {
                myDictionary.put(currentCharacter, 1);
            }

        }

        System.out.println(myDictionary);

        // TODO here we can check the dictionary for any value greater than 1. If we find one, then all the characters are not unique.

        // How do I iterate over all the entries of a java dictionary?
        for(Character key : myDictionary.keySet()){
            if(myDictionary.get(key) > 1){
                System.out.println("Duplicate found!");
                answer = false;
            }
        }


        return answer;
    }

    public static void main (String[] args){
        String testString = "abbccc";
        areAllCharactersUnique(testString);

    }
}
