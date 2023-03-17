package basicPrograms;

import java.util.Arrays;

public class SecondLargest5 {

    public static void main(String[] args) {
		int[] numberArray = {45, 51,71, 28, 75, 49, 42, 68};
		getSecondLargest1(numberArray,numberArray.length);
		getSecondLargest2(numberArray,numberArray.length);
		//getSecondLargest3(numberArray,numberArray.length);
    }

	/*private static void getSecondLargest3(int[] numberArray, int length) {
		Set<Integer> integerSet= new TreeSet<>(Arrays.asList(numberArray));
		Collections.addAll(integerSet,numberArray);
		integerSet.addAll(Arrays.asList(numberArray));
	}*/

	private static void getSecondLargest2(int[] numberArray, int length) {
		Arrays.sort(numberArray);
		//System.out.println(numberArray[length -2]);
		System.out.println(numberArray[numberArray.length -2]);
	}

	public static void getSecondLargest1(int[] a, int length){
		int temp;
		for (int i = 0; i < length; i++)
		{
			for (int j = i + 1; j < length; j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[length - 2]);
	}



}