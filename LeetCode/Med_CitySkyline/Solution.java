package LeetCode.Med_CitySkyline;

import java.util.Arrays;

/**
 * In a 2-D array grid, each value represents the height of a building located there.
 * We are allowed to increase the height of any number of buildings, by any amount. Height 0
 * is also a building.
 *
 *
 */

public class Solution {

    public static int maxIncreaseKeepingSkyline(int[][] grid){


        int n = grid.length;
        int[] row = new int[n];
        int[] col = new int[n];


        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }

        //check
        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));

        // now find the max increase
        int answer = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                answer += Math.min(row[i], col[j]) - grid[i][j];
            }
        }


        return answer;
    }


}
