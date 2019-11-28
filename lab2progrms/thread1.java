import java.util.*;
import java.lang.*;

class Newthread implements Runnable{
    Thread t;

    Newthread(String name){
        t = new Thread(this, name);
        System.out.println("Child thread "+ t);
    }

    public void run(){
        try{
            for(int i = 0; i< 5; i++){
                System.out.println(t.getName() + " BMS CLLGEE");
                Thread.sleep(10000);
            }
        }catch(InterruptedException e){
            System.out.println(t.getName() + " Interrupted");
        }
        System.out.println(t.getName() + " Exiting");
    }
}

class Main{
    public static void main(String[] args) {
        Newthread nt = new Newthread("Bms Thread");

        nt.t.start();

        try{
            for(int i = 0; i < 10; i++){
                System.out.println("Main thread CSEEEE" );
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main thread exiting");
    }
}

