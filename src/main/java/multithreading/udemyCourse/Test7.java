package multithreading.udemyCourse;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("System threads..........");
        Thread thr = Thread.currentThread();
        ThreadGroup grp = thr.getThreadGroup();
        while (grp.getParent() != null) {
            grp = grp.getParent();
        }
        grp.list();
    }
} 