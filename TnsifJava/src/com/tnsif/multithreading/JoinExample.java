package com.tnsif.multithreading;

public class JoinExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2"); 

        thread1.start();
        try {
            thread1.join();
            Thread.sleep(2000);// Main thread waits for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
                  
            }

        thread2.start();
        try {
            thread2.join(); // Main thread waits for thread2 to finish
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("All threads have finished.");
    }
}