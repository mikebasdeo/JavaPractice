package singleton;
import singleton.helpers.Helpers;
import singleton.Singleton;

public class SingletonMain {

    public static void main(String[] args){

        // hook up helpers just in case
        Helpers.printTitle();

        //Singleton mySingleTon = new Singleton();

        Singleton.getInstance();

        System.out.println(Singleton.getDatesList().getFirst());


    }
}
