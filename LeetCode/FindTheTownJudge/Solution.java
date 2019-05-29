/**
 In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

 If the town judge exists, then:

 The town judge trusts nobody.
 Everybody (except for the town judge) trusts the town judge.
 There is exactly one person that satisfies properties 1 and 2.
 You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

 If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 * */

package LeetCode.FindTheTownJudge;

public class Solution {

    public static int findJudge(int N, int[][] trust){

        int[] trustList = new int[N];
        int[] trustedList = new int[N];

        int numRows = trust.length;

        for(int i = 0; i < numRows; i++){
            int a = trust[i][0];
            int b = trust[i][1];
            // System.out.println(a + " Trusts " + b);

            // How many times has each person trusted someone?
            // If someone's trusted nobody, they're a candidate
            // for the judge.
            trustList[a-1]++;

            // How many times has each person been trusted.
            // If someone has been trusted N-1 times, they're a candidate
            // for the judge.
            trustedList[b-1]++;
        }

//        System.out.println(Arrays.toString(trustList));
//        System.out.println(Arrays.toString(trustedList));

        // Now that we have candidates, lets find the judge!
        for(int j = 0; j < trustList.length; j++){
            if(trustList[j] == 0 && trustedList[j] == N-1){
                System.out.println("Actual Judge: " + (j+1) + "\n");
                return (j+1);
            }
        }
        return -1;
    }
}
