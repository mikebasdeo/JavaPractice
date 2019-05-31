package Misc.Infor_Interview;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OperationDefinition {
    // attributes
    List<Integer> list = new ArrayList<Integer>();

    OperationDefinition(){
    }
    //methods
    public List<Integer> getOperationDetailsStore(){
        return this.list;
    }
}

class OperSummary{
    // attributes
    boolean opCond;

    // constructors
    OperSummary(){

    }
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

    @Test
    public void WantsToBeChanged(){
        // Parameters to pass
        OperationDefinition op = new OperationDefinition();
        Map<Long, String> theMainMap = new HashMap<Long, String>();
        OperSummary sum = new OperSummary();
        Assert.assertEquals(0, WantsToBeChanged.performOperation(op, theMainMap,  sum));
    }
}
