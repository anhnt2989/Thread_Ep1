package com.anhnt.flow;

public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                //Cho thread này ngủ 1 lát
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread" + threadName + " interupted.");
        }
        System.out.println("Thread" + threadName + " exiting.");
    }

    @Override
    public void start() {
        System.out.println("Starting" + threadName);
        if (t == null) {
            //Chưa hiểu vì sao lại phải thêm target vào constructor
            t = new Thread(this, threadName);
            t.start();
        }
    }
}