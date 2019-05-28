package DesignPatterns.StrategyPattern;

public abstract class Animal {

    private String name;

    Animal(String name){
        this.name = name;
    }

    public String printName(){
        return "Animal Name: " + this.name;
    }
}
