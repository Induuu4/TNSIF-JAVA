package com.tnsif.multithreading;
public class WaitNotify {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread = new Thread(() -> resource.waitForNotify());
        thread.start();

        try {
            Thread.sleep(2000); // Let the thread wait
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        resource.doNotify();
    }
}