package com.example.MultiThreading;


public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        //  MyThread m = new MyThread();

        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // throw new RuntimeException(e);
                }
            }
        };
            Thread t = new Thread(r);
            t.start();
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello from main thread");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // throw new RuntimeException(e);
                }

            }
        
    }
}