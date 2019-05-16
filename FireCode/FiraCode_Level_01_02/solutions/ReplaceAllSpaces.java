/**
 * Write a method to replace all spaces in a string with a given replacement string
 * */


package FireCode.FiraCode_Level_01_02.solutions;

public class ReplaceAllSpaces {

    public static void main (String[] args){

        String a = "This is a test";
        String b = "/";

        System.out.println(ReplaceAllSpaces.replace(a, b));

    }

    public static String replace(String a, String b){

        // creates a mutable sequence of characters
        StringBuilder str = new StringBuilder();

        //iterate through string and append to StringBuilder each time
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == ' '){
                str.append(b);
            } else {
                str.append(a.charAt(i));
            }
        }
        return str.toString();

    }


}
