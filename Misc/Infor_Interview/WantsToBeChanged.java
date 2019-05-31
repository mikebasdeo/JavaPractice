/**
 * Infor Question
 *
 * Mike Basdeo
 *
 * Solution:
 * Looking for opDetails.getOpStatusID() == 9
 *
 *
 *
 * Progress:
 *  1- Created class definitions for the missing object types.
 *  2- Static definition of map to pass to performOperation
 *
 *  Attempt
 *
 * */

package Misc.Infor_Interview;

import com.sun.javafx.binding.SelectBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;










public class WantsToBeChanged {

    /**
     * @param op
     * @param theMainMap
     * @param sum
     * @author Mike Basdeo
     */
    public static int performOperation(OperationDefinition op, Map<Long, String> theMainMap, OperSummary sum) {
        for (int d = 0; d < op.getOperationDetailsStore().size(); d++) {

            //create a new object called opDetails. Find a way to get this to pass.
            // should NOT be an Integer. but what??


//            OperationDetail opDetails = op.getOperationDetailsStore().get(d);
//            if (opDetails.getOpStatusId() == 1 || opDetails.getOpStatusId() == 3 || opDetails.getOpStatusId() == 4) {
//                sum.setOpCond(true);
//                if (opDetails.getRelblkId() != null && opDetails.getOperationsumRefId() != null &&
//                        opDetails.getOperationsumParentId() != null) {
//                    sum.setIsReliefOperation("Y");
//                    theMainMap.put(opDetails.getOperationsumId(), "Y");
//                }
//            } else {
//                if (opDetails.getRelblkId() != null && opDetails.getOperationsumRefId() != null &&
//                        opDetails.getOperationsumParentId() != null) {
//                    sum.setOpCond(true);
//                    sum.setIsReliefOperation("Y");
//                    theMainMap.put(opDetails.getOperationsumId(), "Y");
//                } else {
//                    sum.setOpCond(true);
//                }
//            }
//            break;
        }
        return 0;
    }
}