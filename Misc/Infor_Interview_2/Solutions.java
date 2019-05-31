package Misc.Infor_Interview_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solutions {

    public static void codeFragment(List<Character> s){

        for (Character MyChar : s) {
            System.out.println(MyChar); }
        for (Character MyChar : s) {
            System.out.println(MyChar + MyChar); }
        for (Character MyChar : s) {
            System.out.println(MyChar + MyChar + MyChar); }
        for (Character MyChar : s) {
            System.out.println(MyChar + MyChar + MyChar + MyChar); }
        for (Character MyChar : s) {
            System.out.println(MyChar + MyChar + MyChar + MyChar + MyChar); }

    }

    public static void codeFragment2(List<Character> s){

        for (Character MyChar : s) {
            for (Character MyCharB : s) {
                for (Character MyCharC : s) {
                    System.out.println(MyChar+ MyCharB + MyCharC);
                }	}	}

    }




    public static void main(String[] args){

        List<Character> s = new ArrayList<Character>(6);

        s.add('b');
        s.add('o');
//        s.add('m');
//        s.add('b');
//        s.add('l');
//        s.add('i');

        codeFragment2(s);


        System.out.println("Hello Toronto!");
    }
}
