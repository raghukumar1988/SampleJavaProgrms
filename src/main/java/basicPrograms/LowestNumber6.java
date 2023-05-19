package basicPrograms;

import java.util.Arrays;

class LowestNumber6 {
    // static block is called even before the main method
    static {
        // check the order of invocation by keeping breakpoints
        System.out.println("Inside static block..");
    }

    public static void main(String args[]) {
        int[] a = {33, 3, 4, 5};// declaring and initializing an array
        printMimimumNumber(a);// passing array to method
        printMaximumNumber(a);
        printMinAndMaxUsingSortMethod(a);
    }

    private static void printMinAndMaxUsingSortMethod(int[] a) {
        Arrays.sort(a);
        System.out.println("Min is " + a[0]);
        System.out.println("Max is " + a[a.length - 1]);
    }

    // creating a method which receives an array as a parameter
    static void printMimimumNumber(int[] arr) {
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
        int max = a[0];
        for (Integer num : a) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }


}