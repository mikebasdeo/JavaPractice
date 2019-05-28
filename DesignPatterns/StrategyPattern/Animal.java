/**
 * This is an abstract class to be used when creating
 * a specific animal. It implements the 'Strategy Pattern'
 * through the use of the Flys(interface) object.
 * @see Flys.java
 */

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
}
