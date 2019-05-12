//import mypack.MyPackageClass;
import helpers.*;
import objects.*;

/**
 * - Basic example of how to hook up java files in different packages
 *
 * @method: testMethod() - static method example inside the helpers package
 *
 * @class: Dog inherits from Animal withing the objects package
 * @method: numOfLegs() method overridden within the Dog class
        */
public class Main {

    public static void main(String[] args) {

        // basic static method imported from helpers package
        helpers.testMethod();

        // basic object imported from objects package
        Animal myBird = new Animal("Iago", "Bird", 2);

        // Create a Dog object which inherits from Animal
        Dog myDog = new Dog("Margo", "German Shepard", 4);

        System.out.println(myBird.toString());
        System.out.println(myBird.getNumOfLegs());

        System.out.println(myDog.toString());
        System.out.println(myDog.getNumOfLegs());



    }
}
