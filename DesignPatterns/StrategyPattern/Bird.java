/**
 * Calls the CantFly class
 * @see Flys.java
 */

package DesignPatterns.StrategyPattern;

public class Bird extends Animal {

    private int numOfWings;

    Bird(String name){
        super(name);
        numOfWings = 2;
        flyingType = new CanFly();
    }
}
