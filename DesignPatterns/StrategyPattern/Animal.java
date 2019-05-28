package DesignPatterns.StrategyPattern;

public abstract class Animal {

    private String name;
    public Flys flyingType;

    Animal(String name){
        this.name = name;
    }

    public String printName(){
        return "Animal Name: " + this.name;
    }

    public boolean doIFly(){
        return flyingType.fly();
    }

    public void SetFlyingType(Flys newFlyType){
        flyingType = newFlyType;
    }
}
