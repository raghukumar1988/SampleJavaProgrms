package multithreading.udemyCourse;

class CopyTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.print("C");
        }
    }
}

class ProgressTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.print("-");
        }
    }
}


public class Test6PriorityExample {
    public static void main(String[] args) {

        CopyTask copyTask = new CopyTask();
        Thread copyThread = new Thread(copyTask);
        copyThread.setPriority(Thread.NORM_PRIORITY + 3);
        copyThread.start();

        ProgressTask progressTask = new ProgressTask();
        Thread progressThread = new Thread(progressTask);
        progressThread.start();

        // You will observe more C's than -'s as task which prints C has more priority.
    }
} 