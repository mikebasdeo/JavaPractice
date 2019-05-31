package Misc.Infor_Interview;

public class OperationDetail {
    // attributes
    Integer opStatusId;
    Integer opSumId;

    //constructors
    OperationDetail(){

    }
    //methods
    public void setOpStatusId(int detailStoreNum){
        this.opStatusId = detailStoreNum;
    }
    public int getOpStatusId(){
        return this.opStatusId;
    }

    public Integer getRelblkId(){
        return 1;
    }
    public Integer getOperationsumRefId(){
        return 1;
    }
    public Integer getOperationsumParentId(){
      return this.opSumId;

    }
    public Long getOperationsumId(){
        return Long.valueOf(this.opSumId);
    }
}