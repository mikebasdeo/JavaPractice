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

        System.out.println(Arrays.deepToString(grid));
        // step 1, find the top/bottom skyline
        int currentValue = 0;
        int currentMax = 0;
        int[] topSkyline = new int[grid[0].length];
        for(int j = 0; j < grid[0].length; j++){

            for(int i = 0; i < grid.length; i++){
                //take first value from all four inner lists
                currentValue = grid[i][j];

                if(currentValue > currentMax){
                    currentMax = currentValue;
                }
                System.out.println(currentValue);
            }

            topSkyline[j] = currentMax;
            currentMax = 0;
            System.out.println("next");
        }
        System.out.println(Arrays.toString(topSkyline));




        return 69;
    }

}
