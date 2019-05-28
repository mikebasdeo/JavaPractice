package DesignPatterns.StrategyPattern;

public interface Flys {
    boolean fly();
}

class CanFly implements Flys{
    public boolean fly(){
        return true;
    }
}


class CantFly implements Flys{
    public boolean fly(){
        return false;
    }
}