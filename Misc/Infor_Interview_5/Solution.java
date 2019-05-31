package Misc.Infor_Interview_5;
/*
* Improve the following method as much as possible (preserving the function name and the inputs)
Ensure that it returns true if and only if both arrays contain the given value.
Note: The lists may be null and may contain null values.
* */

public class Solution {

    public boolean isInBoth(String value, String[] arrayA, String[] arrayB) {
        boolean found = false;

        try {
            for (int a = 0; a <= arrayA.length; a++) {
                for (int b = arrayB.length - 1; b > 0; b--) {
                    if (arrayA[a].equals(arrayB[b])) {
                        throw new Exception("Found!");
                    }
                }
            }
        } catch (Exception e) {
            if ("Found!".equals(e.getMessage())) {
                found = true;
            }
        }

        return found;
    }


}
