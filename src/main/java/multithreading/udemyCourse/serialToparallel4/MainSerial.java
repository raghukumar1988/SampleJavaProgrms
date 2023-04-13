package multithreading.udemyCourse.serialToparallel4;

import java.io.IOException;

public class MainSerial {
    public static void main(String[] args) throws IOException { 
        String sourceFile1 = "a.txt"; 
        String sourceFile2 = "b.txt"; 
        String destFile1 = "c.txt"; 
        String destFile2 = "d.txt"; 
         // 1. Copy a.txt to c.txt 
        IOUtils.copyFile(sourceFile1, destFile1); 
         // 2. Copy b.txt to d.txt 
        IOUtils.copyFile(sourceFile2, destFile2); 
    } 
}