/**
 * You are given an MxN matrix where each integer represents a pixel.
 * Flip it in place along its horizontal axis.
 * */


package FiraCode_Level_01_03.solutions;

public class HorizontalFlip {

    public static void main (String[] args){


        //test matrix
        int myMatrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 77, 83 },
                { 15, 65, 47, 87 },
                { 53, 36, 71, 48 },
                { 9, 10, 11, 12 } };


        int myMatrix2[][] = {{1}};

        flipHorizontalAxis(myMatrix2);

    }

    public static void flipHorizontalAxis(int[][] myMatrix){

        //Rows
        int rows = myMatrix.length;
        System.out.println("Rows: " + rows);
        //Columns
        int columns = myMatrix[0].length;
        System.out.println("Columns: " + columns);

        if(columns == 1){
            System.out.println(myMatrix[0][0]);
        }
        else {


            //because java counting of matrix length starts at 1. Understandable.
            int firstRow = 0;
            int lastRow = rows - 1;

            System.out.println("Size of matrix:" + rows + " x " + columns);

            //don't let the pointers go past each other
            //also, if the pointers are equal, no need to flip anything
            while (firstRow != lastRow && firstRow < lastRow) {

                System.out.print("Swapping Row:" + firstRow + " with Row: " + lastRow + "\n");

                //one temp value to help store in place. like a linked list manipulation
                for (int i = 0; i < columns; i++) {
                    int tempValue;
                    tempValue = myMatrix[firstRow][i];
                    myMatrix[firstRow][i] = myMatrix[lastRow][i];
                    myMatrix[lastRow][i] = tempValue;
                }
                //move rows towards each other
                firstRow++;
                lastRow--;
            }

            System.out.println("Printing Matrix");

            for (int currentRow = 0; currentRow < rows; currentRow++) {

                for (int currentColumn = 0; currentColumn < columns; currentColumn++) {
                    System.out.print(myMatrix[currentRow][currentColumn] + " ");
                }
                System.out.println();
            }
        }

    }


}
