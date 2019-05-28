/**
 * Run program from here.
 *
 * Please try to keep the animals in the zoo (hashmap).
 */

package DesignPatterns.StrategyPattern;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class Tests {

    @Test
    public void AnimalTest(){

        Animal myDog = new Dog("Spot");
        Animal myBird = new Bird("Falcor");

        Map<Animal, Flys> zoo = new HashMap<Animal, Flys>();

        zoo.put(myDog, myDog.flyingType);
        zoo.put(myBird, myBird.flyingType);

        for(Animal currentAnimal: zoo.keySet()){
            System.out.println(currentAnimal.printName() + zoo.get(currentAnimal).fly());
        }
    }
}
