package singleton;
import singleton.helpers.Helpers;


public class SingletonMain {

    public static void main(String[] args){

        Helpers.printTitle();

        Singleton.getInstance();

        System.out.println(Singleton.getDatesList().size());

        Singleton.removeFirstMonth();

        System.out.println(Singleton.getDatesList().size());


    }
}
