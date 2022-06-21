package org.gingerjake.multithreading;

class RunnableDemo implements Runnable {
   private Thread thread;
   private final String threadName;
   private final int threadDelay;
   
   RunnableDemo(String name, int delay) {
      threadName = name;
      threadDelay = delay;
      System.out.println("Creating " + threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int thread = 4; thread > 0; thread--) {
            System.out.println("Thread: " + threadName + ", " + thread);
            // Let the thread sleep for a while.
            Thread.sleep(threadDelay);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (thread == null) {
         thread = new Thread (this, threadName);
         thread.start ();
      }
   }
}
