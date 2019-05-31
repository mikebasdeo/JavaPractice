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

        int temp1 = u(a,c);

        if(a < temp1){
            boolean result = (b == c) ? false : true;
            return result;
        }
        return false;
    }

}
