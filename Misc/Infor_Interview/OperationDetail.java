package Misc.Infor_Interview;

public class OperationDetail {
    // attributes
    int opStatusID;

    //constructors
    OperationDetail(){

    }
    //methods
    public void setOperationDetailsStore(int detailStoreNum){
        this.opStatusID = detailStoreNum;
    }
    public int getOperationDetailsStore(){
        return this.opStatusID;
    }
}