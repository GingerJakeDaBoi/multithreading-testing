package org.gingerjake.multithreading;

class Test1 implements Runnable {
    private Thread thread;
    private final String threadName;
    private final int threadDelay;

    Test1(String name, int delay) {
        threadName = name;
        threadDelay = delay;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        System.out.println("Hello World");
        for (int thread = 4; thread > 0; thread--) {
            System.out.println("Thread: " + threadName + ", " + thread);
            //let the thread sleep for a specified time (threadName)
            try {
                Thread.sleep(threadDelay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
