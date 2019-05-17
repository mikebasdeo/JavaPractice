package Misc.zoo;

public class Dog extends Animal{

    //attributes


    //constructor
    public Dog(String _name, String _type, int _numOfLegs){
        super(_name, _type, _numOfLegs);
    }

    //methods
    @Override
    public int getNumOfLegs() {
        return super.getNumOfLegs() + 1;
    }
}
