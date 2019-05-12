//import mypack.MyPackageClass;
import helpers.*;
import objects.*;

public class Main {

    public static void main(String[] args) {

        // basic static method imported from a helpers package
        helpers.testMethod();

        // basic object imported from an objects package
        Animal myBird = new Animal("Iago", "Bird", 2);

        // Try to create a Dog object which inherits from Animal
        Dog myDog = new Dog("Margo", "German Shepard", 4);


        System.out.println(myBird.toString());
        System.out.println(myBird.getNumOfLegs());

        System.out.println(myDog.toString());
        System.out.println(myDog.getNumOfLegs());



    }
}
