package DesignPatterns.StrategyPattern;

public class Dog extends Animal {

    private int numOfLegs;

    Dog(String name){
        super(name);
        numOfLegs = 4;
        flyingType = new CantFly();
    }
}
