package Misc.Infor_Interview;

import java.util.ArrayList;
import java.util.List;

public class OperationDefinition {

    // attributes
    List<Integer> myList = new ArrayList<Integer>();

    OperationDefinition(int listSize){
        for(int i = 0; i < listSize; i++){
            this.myList.add(i, i*10);
        }
    }
    //methods
    public List<Integer> getOperationDetailsStore(){
        return this.myList;
    }
}
