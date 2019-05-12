package objects;
import helpers.AnimalInterface;

public class Animal implements AnimalInterface{

    //attributes
    private String name;
    private String type;
    private int numOfLegs;

    //constructors
    public Animal(String _name, String _type, int _numOfLegs){
        this.name = _name;
        this.type = _type;
        this.numOfLegs = _numOfLegs;
    }


    //methods
    public String toString(){
        return this.name + this.type + this.numOfLegs;
    }

    public int getNumOfLegs(){
        return this.numOfLegs;
    }

}
