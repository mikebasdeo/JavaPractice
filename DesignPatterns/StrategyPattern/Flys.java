/**
 * Strategy Pattern
 *
 * The decision to be made/what is returned, is defined
 * within the interface. Subclasses that implement the interface
 * will make the decision when called (in our case, inside the Dog and
 * Bird constructors)
 */

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