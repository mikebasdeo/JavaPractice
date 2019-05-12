//import mypack.MyPackageClass;
import helpers.*;
import objects.*;

public class Main {

    public static void main(String[] args) {

        // basic static method imported from a helpers package
        helpers.testMethod();

        // basic object imported from an objects package
        Animal myAnimal = new Animal("Chubs", "Cat", 4);

        System.out.println(myAnimal.toString());
    }
}
