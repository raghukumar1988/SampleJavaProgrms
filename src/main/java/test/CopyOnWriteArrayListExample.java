package test;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Create and start multiple threads for reading
        for (int i = 0; i < 3; i++) {
            Thread readerThread = new Thread(() -> {
                for (String fruit : list) {
                    System.out.println(Thread.currentThread().getName() + " - " + fruit);
                }
            });
            readerThread.start();
        }

        // Create and start a thread for adding elements
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add("Mango");
            System.out.println("Element added by " + Thread.currentThread().getName());
        });
        writerThread.start();
    }
}
