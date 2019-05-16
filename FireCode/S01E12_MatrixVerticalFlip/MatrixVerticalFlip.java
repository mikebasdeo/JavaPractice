package FireCode.S01E12_MatrixVerticalFlip;

import java.util.Arrays;

public class MatrixVerticalFlip {

    public static void flipVerticalAxis(int[][] matrix){


        //now lets try to make any change and then print it out?

        int left = 0;
        int right = matrix[0].length-1;


        // TODO start loop here
        while(left < right){

        for(int[] row : matrix){
            int tempValue = row[left];
            row[left] = row[right];
            row[right] = tempValue;

        }
        left ++;
        right --;

        }

        printMatrix(matrix);




    }

    public static void printMatrix(int[][] testMatrix){
        for(int[] row: testMatrix){
            for (int column: row){
                System.out.print(column);
            }
            System.out.println();
        }
    }



    public static void main(String[] args){

        int[][] testMatrix = {{1,2,3},{4,5,6},{7,8,9},{7,8,9}};

        printMatrix((testMatrix));


        flipVerticalAxis(testMatrix);
    }

}
