/**
 * You are given an MxN matrix where each integer represents a pixel.
 * Flip it in place along its horizontal axis.
 * */


package Misc.Colony.solutions;

public class Colony {



    public static void cellCompete(int[] cells, int days){

        //for(int x = 0; x < days; x++){}

            int neighbourFront;
            int neighbourBack;

            for (int i = 1; i < cells.length -1; i++){


                neighbourFront = cells[i-1];
                neighbourBack = cells[i+1];

                System.out.println(i + ""+ cells[i]);
                System.out.println("NFront:"+ neighbourFront+ " Nback:" + neighbourBack);
                if(neighbourFront ==neighbourBack){
                    System.out.println("Cell in position: " +i+" will become inactive");
                }

            }
            System.out.println();




    }

public static void main (String[] args){
    System.out.println("Hello From Misc.Colony");

    int[] testArray = {0,1,0,1,0,0,0, 0};
    int days = 1;





    cellCompete(testArray, 3);

}


}
