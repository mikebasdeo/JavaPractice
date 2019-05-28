package DesignPatterns.StrategyPattern;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tests {

    @Test
    public void AnimalTest(){

        Animal myDog = new Dog("Spot");
        myDog.printName();

        Animal myBird = new Bird("Falcor");
        myBird.printName();

        // try to put them all in a hashmap for fun
        Map<Animal, Integer> zoo = new HashMap<Animal, Integer>();

        zoo.put(myDog, 1);
        zoo.put(myBird, 2);

        System.out.println(Arrays.asList(zoo));
        // almost, print out the names?

        for(Animal currentAnimal: zoo.keySet()){
            System.out.println(currentAnimal.printName() + zoo.get(currentAnimal));
        }


    }
}
