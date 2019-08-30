package DesignPatterns.ObserverPattern;

public class StockObserver implements Observer{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private int observerID;


    private static int observerIDTracker = 0;
    private Subject stockGrabber;

    //constructor
    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer" + this.observerID);
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = applPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices(){
        System.out.println(this.ibmPrice);
        System.out.println(this.googPrice);
        System.out.println(this.aaplPrice);
    }

}
