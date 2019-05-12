package mypack;

public class Animal {

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
}
