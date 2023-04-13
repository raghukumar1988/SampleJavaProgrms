package multithreading.udemyCourse.deadlock14;

class Writer11 extends Thread {

    Object book;
    Object pen;

    public Writer11(Object book, Object pen) {
        this.book = book;
        this.pen = pen;
    }

    @Override
    public void run() {
        synchronized (book) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (pen) {
                System.out.println("Writer1 writing");
            }
        }
    }
}


class Writer22 extends Thread {

    Object book;
    Object pen;

    public Writer22(Object book, Object pen) {
        this.book = book;
        this.pen = pen;
    }


    @Override
    public void run() {
        synchronized (book) { // same order as writer11
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (pen) {
                System.out.println("Writer2 writing");
            }
        }
    }
}


public class DeadLockSolution {

    public static void main(String[] args) {
        Object book = new Object();
        Object pen = new Object();
        new Writer11(book, pen).start();
        new Writer22(book, pen).start();
        System.out.println("Main is done");

        // Notice the red running icon is NOT VISIBLE after the program execution.
    }
} 