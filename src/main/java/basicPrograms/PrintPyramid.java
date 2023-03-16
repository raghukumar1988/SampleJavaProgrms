package basicPrograms;
import java.util.Scanner;


/*  Scanner to get the no of rows(n)
 for loop 1 - to print n lines
 inner for loop 1 to print the n spaces before a number
 inner for loop 2 to print the number
 Add spaces in inner loop 2 to maintain the pyramid layout  */

public class PrintPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        //Taking noOfRows value from the user
 
        System.out.println("How Many Rows You Want In Your Pyramid?");
 
        int noOfRows = sc.nextInt();
 
        //Initializing rowCount with 1
 
        int rowCount = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing 'rowCount' value 'rowCount' times at the end of each row
 
            for (int j = 1; j <= rowCount; j++)
            {
               // System.out.print(rowCount+" ");
                System.out.print(j+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
    }
}

