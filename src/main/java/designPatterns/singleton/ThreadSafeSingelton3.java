package designPatterns.singleton;

public class ThreadSafeSingelton3 {
    private static ThreadSafeSingelton3 instance = null;

    private ThreadSafeSingelton3() {
        //init work here
    }

    /* We are adding double null check to make sure that only one
    instance was created in case of  multithreading */

    public static ThreadSafeSingelton3 getInstance() {
        if (null == instance) {
            synchronized (ThreadSafeSingelton3.class) {
                if (null == instance) {
                    instance = new ThreadSafeSingelton3();
                }
            }
        }

        return instance;
    }

}
