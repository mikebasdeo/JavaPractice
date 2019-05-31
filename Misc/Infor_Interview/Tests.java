package Misc.Infor_Interview;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Tests {

    @Test
    public void WantsToBeChanged(){

        OperationDefinition op = new OperationDefinition(10);
        Map<Long, String> theMainMap = new HashMap<Long, String>();
        OperSummary sum = new OperSummary();

        Assert.assertEquals(0, WantsToBeChanged.performOperation(op, theMainMap,  sum));
    }
}
