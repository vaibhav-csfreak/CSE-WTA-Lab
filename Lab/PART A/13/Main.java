class MyThread extends Thread {

    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " is running");
            sleep(2500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class Main extends Thread {

    public static void main(String args[]) {
        System.out.println("Current thread is " + Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        System.out.println("is t1 Alive ?" + t1.isAlive());
        t1.setPriority(10);
        t1.start();
        try {
            System.out.println("priority "+ t1.getPriority());
            System.out.println("is t1 Alive ?" + t1.isAlive());
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Is t1 Alive?"+t1.isAlive());
        System.out.println("Is main Alive?"+Thread.currentThread().isAlive());
    }
}







///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class mythreadq13 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running!");
    }

    public static void main(String[] args) {
        mythreadq13 t1 = new mythreadq13();
        System.out.println(Thread.currentThread().getName());
        t1.start();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t1.isAlive());
        mythreadq13 t2 = new mythreadq13();
        System.out.println(Thread.currentThread().getName());
        t2.setPriority(8);
        System.out.println(t2.isAlive());
        System.out.println(t1.getPriority() + " ==== " + t2.getPriority());
        System.out.println(Thread.currentThread().getName() + " is alive.");
    }
}



















