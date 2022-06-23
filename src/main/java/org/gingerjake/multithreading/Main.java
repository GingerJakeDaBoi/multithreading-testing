package org.gingerjake.multithreading;

public class Main {

    public static void main(String[] args) {
        Test1 R1 = new Test1("Thread-1", 20);
        R1.start();

        Test2 R2 = new Test2("Thread-2", 4);
        R2.start();
    }

}
