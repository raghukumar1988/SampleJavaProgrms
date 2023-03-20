package basicPrograms;

import java.util.Arrays;

public class ThirdLargest5 {
    public static void main(String[] args) {
        System.out.println("Second Largest --> "+secondLargest(new int[]{45, 51, 28, 75, 49, 42}));
        System.out.println("Third Largest --> "+thirdLargest(new int[]{45, 51, 28, 75, 49, 42}));
        System.out.println("Second Largest --> "+secondLargest(new int[]{985, 521, 975, 831, 479, 861}));
        System.out.println("Third Largest --> "+thirdLargest(new int[]{985, 521, 975, 831, 479, 861}));
        System.out.println("Second Largest --> "+secondLargest(new int[]{9459, 9575, 5692, 1305, 1942, 9012}));
        System.out.println("Second Largest --> "+secondLargest(new int[]{47498, 14526, 74562, 42681, 75283, 45796}));

    }
    // We can apply the same to find second largest largest
    private static int thirdLargest(int[] numberArray) {
        int thirdLargest,temp= 0;
        System.out.println("Before sorting  -->"+ Arrays.toString(numberArray));
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i+1; j < numberArray.length; j++) {
                if(numberArray[i]>numberArray[j]){
                    temp= numberArray[i];
                    numberArray[i]=numberArray[j];
                    numberArray[j]= temp;
                }
            }
        }
        System.out.println("After sorting  -->"+ Arrays.toString(numberArray));
        if(numberArray.length<3){
            System.out.println("Invalid input");
            return 0;
        }
        thirdLargest= numberArray[2];
        return thirdLargest;
    }

    private static int secondLargest(int[] numberArray) {
        int firstLargest, secondLargest;
        if (numberArray[0] > numberArray[1]) {
            firstLargest = numberArray[0];
            secondLargest = numberArray[1];
        } else {
            firstLargest = numberArray[1];
            secondLargest = numberArray[0];
        }
        for (int i = 2; i < numberArray.length; i++) {
            if (numberArray[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numberArray[i];
            } else if (numberArray[i] < firstLargest && numberArray[i] > secondLargest) {
                secondLargest = numberArray[i];
            }

        }
        return secondLargest;
    }
}
