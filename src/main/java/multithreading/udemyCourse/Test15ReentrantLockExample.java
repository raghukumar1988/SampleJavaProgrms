package multithreading.udemyCourse;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


class Sample22 {
    private int x;

    // ReadWriteLock object for requesting the lock.
    ReadWriteLock rw_lock = new ReentrantReadWriteLock();

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public void incr() {
        // Request the write lock as the
        // operation is intended to modify the data.
        Lock lock = rw_lock.writeLock();
        lock.lock();
        try {
            int y = getX();
            y++;
            // Just for simulation
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            setX(y);
        } finally {
            //Unlock
            lock.unlock();
        }
    }
}


class MyThread33 extends Thread {
    Sample22 obj;

    public MyThread33(Sample22 obj) {
        this.obj = obj;
    }


    public void run() {
        obj.incr();
    }

}


public class Test15ReentrantLockExample {
    public static void main(String[] args) {
        Sample22 obj = new Sample22();
        obj.setX(10);
        MyThread33 t1 = new MyThread33(obj);
        MyThread33 t2 = new MyThread33(obj);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(obj.getX());
    }
}