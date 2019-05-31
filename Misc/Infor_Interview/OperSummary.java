package Misc.Infor_Interview;

public class OperSummary {

    // attributes
    boolean opCond;
    boolean ReliefOperation = false;

    // constructors
    OperSummary(){

    }
    // methods
    public void setOpCond(boolean change){
        this.opCond = change;
    }

    public void setIsReliefOperation(String reliefOperation){
        this.ReliefOperation = reliefOperation == "Y" ? true : false ;
    }

}
