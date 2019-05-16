/**
 * Insert Something at the end of a Linked List
 * */

package FireCode.FiraCode_Level_01_07.solutions;



public class ReverseAString {

    public static void main (String[] args){
        //test input
        System.out.println(reverseString("abc"));
    }

    public static String reverseString(String str){
        String inputString = str;
        String outputString = null;
        StringBuilder myStringBuilder = new StringBuilder();

        //TODO lets do a reverse for loop
        for(int i = str.length()-1; i >= 0; i--) {
            Character currentChar = str.charAt(i);
            myStringBuilder.append(currentChar);
        }

        return myStringBuilder.toString();
    }


}
