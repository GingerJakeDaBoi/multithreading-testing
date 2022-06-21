package org.gingerjake.multithreading;

public class Main {

   public static void main(String args[]) {
      RunnableDemo R1 = new RunnableDemo("Thread-1", 20);
      R1.start();
      
      RunnableDemo R2 = new RunnableDemo("Thread-2", 4);
      R2.start();
   }   
}