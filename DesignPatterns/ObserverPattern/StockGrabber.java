package DesignPatterns.ObserverPattern;

import java.util.ArrayList;

// you can import an interface! remember that!
import DesignPatterns.ObserverPattern.Observer;

public class StockGrabber implements Subject{

    // you can make a list of type Interface!!!
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        this.observers = new ArrayList<Observer>();
    }


    @Override
    public void register(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unregister(Observer o) {

        int indexToDelete = this.observers.indexOf(o);
        System.out.println("Removing:" + o);
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : this.observers){
            o.update(ibmPrice, aaplPrice, googPrice);
        }

    }

    public void setIBMPrice(double newPrice){
        this.ibmPrice = newPrice;
        notifyObserver();
    }
    public void setaaplPrice(double newPrice){
        this.aaplPrice = newPrice;
        notifyObserver();
    }
    public void setgoogPrice(double newPrice){
        this.googPrice = newPrice;
        notifyObserver();
    }


}
