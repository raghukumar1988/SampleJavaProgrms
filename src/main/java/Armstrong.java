public class Armstrong {
	public static  boolean checkArmstrongNumber(int number) {
		String strNumber = String.valueOf(number);
		int value = 0;

		for (int i = 0; i<strNumber.length(); i++) {
		//value += Math.pow(Integer.parseInt(strNumber.substring(i, i+1)), strNumber.length());
			
		}

		return value == number;
		}

	public static void main(String[] args) {
		checkArmstrongNumber(153);

		
	}
}