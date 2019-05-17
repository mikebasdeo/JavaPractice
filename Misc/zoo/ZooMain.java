/**
 * - Java fundamentals practice
 *
 * @staticmethod: testMethod() - static method example inside the solutions package
 *
 * @class: Animal inside Misc.linked_list package. Implements interface from 'helper/AnimalInterface.java'
 * @class: Dog inherits from Animal within the Misc.linked_list package
 * @method: numOfLegs() method overridden within the Dog class. Also enforeced by
 *
        */

package Misc.zoo;
import Misc.zoo.helpers.helpers;

public class ZooMain {

    public static void main(String[] args) {

        // static method imported from solutions package
        helpers.testMethod();

        // object imported from Misc.linked_list package
        Animal myBird = new Animal("Iago", "Bird", 2);

        // Create a Dog object which inherits from Animal
        Animal myDog = new Dog("Margo", "German Shepard", 4);

        System.out.println(myBird.toString());
        System.out.println(myBird.getNumOfLegs());

        System.out.println(myDog.toString());
        System.out.println(myDog.getNumOfLegs());

    }
}
