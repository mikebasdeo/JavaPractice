package Misc.threads;

class Thread2 implements Runnable {

    public void run(){
        System.out.println("Thread 2");
    }
}

public class Thread implements Runnable {


    //this is a thread?
    public void run(){
        System.out.println("Thread 1");
    }

    public static void main(String[] args){
        System.out.println("Hello Thread!");


        Thread t1 = new Thread();
        t1.run();

        Thread2 t2 = new Thread2();
        t2.run();
    }

}
