package org.gingerjake.multithreading;

class Runnable2 implements Runnable {
    private Thread t;
    private final String NAME;
    private final int DELAY;

    Runnable2(String name, int delay) {
        NAME = name;
        DELAY = delay;
        System.out.println("Creating " + NAME);
    }

    public void run() {
        System.out.println("Running " +  NAME);
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + NAME + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  NAME + " interrupted.");
        }
        System.out.println("Thread " +  NAME + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  NAME);
        if (t == null) {
            t = new Thread (this, NAME);
            t.start();
        }
    }
}
