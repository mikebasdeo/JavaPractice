/**
 * Infor Question
 *
 * Mike Basdeo
 *
 * Solution:
 * Looking for opDetails.getOpStatusID() == 9

 * Steps:
 *  1- Created class definitions for the missing object types.
 *  2- Static definition of map to pass to performOperation
 *  3- Pray
 *
 * */

package Misc.Infor_Interview;
import java.util.Map;


public class WantsToBeChanged {

    public static int performOperation(OperationDefinition op, Map<Long, String> theMainMap, OperSummary sum) {

        OperationDetail opDetails = new OperationDetail();

        for (int d = 0; d < op.getOperationDetailsStore().size(); d++) {

            opDetails.setOpStatusId(op.getOperationDetailsStore().get(d));

            if (opDetails.getOpStatusId() == 1 || opDetails.getOpStatusId() == 3 || opDetails.getOpStatusId() == 4) {
                sum.setOpCond(true);
                if (opDetails.getRelblkId() != null && opDetails.getOperationsumRefId() != null &&
                        opDetails.getOperationsumParentId() != null) {
                    sum.setIsReliefOperation("Y");
                    theMainMap.put(opDetails.getOperationsumId(), "Y");
                }

            } else {
                if (opDetails.getRelblkId() != null && opDetails.getOperationsumRefId() != null &&
                        opDetails.getOperationsumParentId() != null) {
                    sum.setOpCond(true);
                    sum.setIsReliefOperation("Y");
                    theMainMap.put(opDetails.getOperationsumId(), "Y");
                } else {
                    sum.setOpCond(true);
                }
            }
        }
        return opDetails.getOpStatusId();
    }
}