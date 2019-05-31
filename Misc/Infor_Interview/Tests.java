package Misc.Infor_Interview;

import org.junit.Test;
import org.junit.Assert;




import java.util.ArrayList;
import java.util.List;


class OperationDefinition {
    // attributes
    List<Integer> list = new ArrayList<Integer>();

    //    OperationDefinition(int value){
//        this.value = value;
//    }
    //methods
    public List<Integer> getOperationDetailsStore(){
        return this.list;
    }
}

class OperSummary{
    // attributes
    boolean opCond;

    // constructors
    // methods
    public void setOpCond(boolean change){
        this.opCond = change;
    }


}

class OperationDetail {
    // attributes
    int opStatusID;

    //constructors
    OperationDetail(int x){

    }
    //methods
    public int getOpStatusId(){
        return this.opStatusID;
    }
}





public class Tests {

    public void WantsToBeChanged(){

        Assert.assertEquals(0, WantsToBeChanged.performOperation());
    }


}
