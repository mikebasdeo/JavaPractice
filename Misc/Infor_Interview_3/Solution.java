package Misc.Infor_Interview_3;

public class Solution {

    public static int u(int a, int c) {
        int f = 0;
        for (int i = 0; i < c; i++) {
            f += a;
        }
        return f;
    }

    public static boolean funToMakeSimpler(int a, int b, int c) {


        if (a < u(a, c) && b < c || a < u(a, c) && b > c && c < b) {
            return true;
        }


        return false;
    }


}
