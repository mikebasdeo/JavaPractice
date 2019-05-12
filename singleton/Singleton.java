package singleton;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {

    //attributes
    private static Singleton firstInstance = null;

    static String [] dates = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static LinkedList<String> datesList = new LinkedList<String>(Arrays.asList(dates));

    //constructors
    private Singleton(){

    }


    //methods
    public static Singleton getInstance(){
        if(firstInstance == null){


            firstInstance = new Singleton();
        }
        return firstInstance;
    }

    public static LinkedList<String> getDatesList(){
        return datesList;
    }

    public static void removeFirstMonth(){
        datesList.remove();
    }

}
