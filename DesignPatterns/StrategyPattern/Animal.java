package DesignPatterns.StrategyPattern;

public abstract class Animal {

    //attributes
    private String name;


    //constructors
    Animal(String name){
        this.name = name;
    }

    //methods
    public String printName(){
        return "Animal Name: " + this.name;
    }


}
