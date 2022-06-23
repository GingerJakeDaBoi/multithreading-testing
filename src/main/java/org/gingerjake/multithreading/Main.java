package org.gingerjake.multithreading;

public class Main {

   public static void main(String[] args) {
      Runnable1 R1 = new Runnable1("Thread-1", 20);
      R1.start();
   }

}
