package multithreading.udemyCourse;

class Task2 extends Thread {
    // Thread execution begins here. 
    public void run() { 
        // performs the task i.e. prints 1500 T's 
        doTask(); 
    } 
 
    public void doTask() {
        for (int i = 1; i <= 1500; i++) {
            System.out.print("T");
        } 
    } 
} 
 
public class Test2 {
    // Runs with in the Main thread started by JVM. 
    public static void main(String[] args) { 
        Task2 t1 = new Task2();

        // Starts a separate Thread using the 
        // the start method of the Thread class. 
        t1.start();

        // runs in the Main thread and prints 1500 M's 
        for (int i = 1; i <= 1500; i++) { 
            System.out.print("M"); 
        } 
    } 
} 