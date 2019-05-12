/**
 * - Java fundamentals practice
 *
 * @staticmethod: testMethod() - static method example inside the helpers package
 *
 * @class: Animal inside linked_list package. Implements interface from 'helper/AnimalInterface.java'
 * @class: Dog inherits from Animal within the linked_list package
 * @method: numOfLegs() method overridden within the Dog class. Also enforeced by
 *
        */

package zoo;
import zoo.helpers.helpers;

public class ZooMain {

    public static void main(String[] args) {

        // static method imported from helpers package
        helpers.testMethod();

        // object imported from linked_list package
        Animal myBird = new Animal("Iago", "Bird", 2);

        // Create a Dog object which inherits from Animal
        Dog myDog = new Dog("Margo", "German Shepard", 4);

        System.out.println(myBird.toString());
        System.out.println(myBird.getNumOfLegs());

        System.out.println(myDog.toString());
        System.out.println(myDog.getNumOfLegs());

    }
}
