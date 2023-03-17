package basicPrograms;

import java.util.Scanner;


/*  Scanner to get the no of rows(n)
 for loop 1 - to print n lines
 inner for loop 1 to print the n spaces before a number
 inner for loop 2 to print the number/symbol
 Add spaces in inner loop 2 to maintain the pyramid layout

 Refer MUST Go - https://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/  */

public class PrintPyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");
        int noOfRows = sc.nextInt();
        printPyramidPattern1(noOfRows);
        printPyramidPattern2(noOfRows);
        printPyramidPattern3(noOfRows);
        printPyramidPattern4(noOfRows);
        printPyramidPattern5(noOfRows);
        printPyramidPattern6(noOfRows);

    }

    private static void printPyramidPattern1(int noOfRows) {
        int rowCount = 1;
        for (int i = noOfRows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
        System.out.println("########################################");
    }

    private static void printPyramidPattern2(int noOfRows) {
        //Initializing rowCount with 1
        int rowCount = 1;
        for (int i = noOfRows; i > 0; i--) {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //Printing 'rowCount' value 'rowCount' times at the end of each row
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
        System.out.println("########################################");
    }

    private static void printPyramidPattern3(int noOfRows) {
        int rowCount = 1;
        for (int i = noOfRows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < rowCount; j++) {
                System.out.print("* ");
            }
            System.out.println();
            rowCount++;
        }
        System.out.println("########################################");
    }

    private static void printPyramidPattern4(int noOfRows) {
        int rowCount = 1;
        for (int i = noOfRows; i > 0; i--) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;
        }
        System.out.println("########################################");
    }

    private static void printPyramidPattern5(int noOfRows) {
        int rowCount = noOfRows;
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount--;
        }
        System.out.println("########################################");

    }

    private static void printPyramidPattern6(int noOfRows) {
        int rowCount = 1; // not needed
        for (int i = noOfRows; i >= 1; i--) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= noOfRows; j++) {
                System.out.print(j + " ");
            }
            for (int j = noOfRows - 1; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;
        }
        System.out.println("########################################");

    }
}

