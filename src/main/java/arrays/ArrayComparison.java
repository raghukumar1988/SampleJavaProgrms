package arrays;
import java.util.Arrays;

public class ArrayComparison {
	public static void main(String args[]) {
		String[] strArr1 = { "java", "swings", "j2ee", "struts", "jsp", "hibernate" };
		String[] strArr2 = { "java", "struts", "j2ee", "hibernate", "swings", "jsp" };

		isEqualByMethod(strArr1, strArr2);

		int[] arrayOne = { 2, 5, 1, 7, 4 };
		int[] arrayTwo = { 2, 5, 1, 7, 4 };

		System.out.println(isEqualByManual(arrayOne, arrayTwo));

	}

	private static boolean isEqualByManual(int[] arrayOne, int[] arrayTwo) {
		boolean isEqual = true;
		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					isEqual = false;
				}
			}

		} else {
			isEqual = false;
		}
		return isEqual;

	}

	private static void isEqualByMethod(String[] strArr1, String[] strArr2) {
		System.out.println(Arrays.equals(strArr1, strArr2));
		Arrays.sort(strArr1);
		Arrays.sort(strArr2);
		System.out.println(Arrays.equals(strArr1, strArr2));

	}

}