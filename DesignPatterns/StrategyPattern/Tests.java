package DesignPatterns.StrategyPattern;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class Tests {

    @Test
    public void AnimalTest(){

        Animal myDog = new Dog("Spot");
        Animal myBird = new Bird("Falcor");

        Map<Animal, Integer> zoo = new HashMap<Animal, Integer>();

        zoo.put(myDog, 1);
        zoo.put(myBird, 2);

        for(Animal currentAnimal: zoo.keySet()){
            System.out.println(currentAnimal.printName() + zoo.get(currentAnimal));
        }
    }
}
