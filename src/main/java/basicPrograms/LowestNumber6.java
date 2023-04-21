package basicPrograms;

import org.junit.jupiter.api.Test;

class LowestNumber6 {
    static{ // static block is called even before the main method
        System.out.println("Inside static block.."); // check the order of invocation by keeping breakpoints
    }

    public static void main(String args[]) {
        int a[] = {33, 3, 4, 5};// declaring and initializing an array
        printMimimumNumber(a);// passing array to method
        printMaximumNumber(a);
    }

    // creating a method which receives an array as a parameter
    static void printMimimumNumber(int arr[]) {
        int min = arr[0];
        /* for (int i : arr) {   //simplified version
            if (min > i)
                min = i;
        }*/
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])   //min assigned with new value
                min = arr[i];
        }
        System.out.println(min);
    }

    private static void printMaximumNumber(int[] a) {
        int max= a[0];
        for(Integer num:a){
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);
    }


}