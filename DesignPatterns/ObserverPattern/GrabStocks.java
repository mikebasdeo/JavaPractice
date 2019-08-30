package DesignPatterns.ObserverPattern;

public class GrabStocks {

    public static void main (String[] args){
        System.out.println("Hello From GrabStocks");

        StockGrabber myStockGrabber = new StockGrabber();

        // set up the grabber completely
        myStockGrabber.setIBMPrice(10);
        myStockGrabber.setaaplPrice(20);
        myStockGrabber.setgoogPrice(30);

        StockObserver observer1 = new StockObserver(myStockGrabber);
        observer1.printThePrices();
        observer1.update(1,2,3);
        StockObserver observer2 = new StockObserver(myStockGrabber);
        observer2.printThePrices();



    }
}
