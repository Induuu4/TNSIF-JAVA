package com.tnsif.multithreading;
class SharedResource {
    public synchronized void waitForNotify() {
        try {
            System.out.println("Thread is waiting...");
            wait();
            System.out.println("Thread is notified.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void doNotify() {
        System.out.println("Notifying thread...");
        notify();
    }
}


