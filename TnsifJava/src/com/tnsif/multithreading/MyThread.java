package com.tnsif.multithreading;
class MyThread extends Thread {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        try {
            System.out.println(threadName + " started.");
            Thread.sleep(1000); // Simulate some work
            System.out.println(threadName + " finished.");
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
    }
}
