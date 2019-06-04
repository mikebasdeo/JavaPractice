package Misc.ErrorHandling;

public class Solution {

    public static int testErrors(int x, int y){

        int answer = 0;

        try{
            answer = Solution.addTwoNumbers(x,y);
        } catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

        return answer;


    }

    public static int addTwoNumbers(int x, int y){
        if(x + y > 10){
            throw new IllegalArgumentException("Too Big");
        }
        return x + y;
    }

}
