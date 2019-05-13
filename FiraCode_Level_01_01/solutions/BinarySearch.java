package FiraCode_Level_01_01.solutions;

public class BinarySearch {

    public static void main (String[] args){

        int[] theArray = {2,4,6,8,10,12,14,16,18,20};
        int valueNeeded = 0;

//        int x = 15;
//        int y = 2;
//        System.out.println(x/y);
        int left = 0;
        int right = theArray.length;
        System.out.print(binarySearch(theArray, valueNeeded, left, right));
    }

    public static boolean binarySearch(int[] theArray, int valueNeeded, int left, int right){

        // don't let the bounds swap places.
        while(left < right){

            int midPoint = (left + right) / 2;

            if (theArray[midPoint] == valueNeeded){
                return true;
            }

            if(valueNeeded < theArray[midPoint]){
                right = midPoint;
            }
            if(valueNeeded > theArray[midPoint]){
                left = midPoint + 1;
            }

        }
        return false;


    }


}
