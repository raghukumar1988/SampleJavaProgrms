package basicPrograms;

/*https://javaconceptoftheday.com/java-program-to-reverse-a-string/
*/
public class StringReversal1 {

	public static void main(String[] args) {
		String str = "MyJava";
		reverseString1(str); //using StringBuffer append method 1
		reverseString11(str); //using StringBuilder insert method 2
		reverseStringUsingBuilder(str);// using reverse method 3
		System.out.println("Using recursive method "+recursiveMethod(str));//recursive method 4
	}
	private static void reverseString1(String str) {
		StringBuffer revString = new StringBuffer();  // StringBuffer is legacy synchronised class
		// String revString = "";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			// revString += charArray[i]; //using String assignment operator
			revString.append(charArray[i]); // using StringBuffer append method
		}
		System.out.println("Reverse using StringBuffer append "+revString);
	}

	private static void reverseString11(String str) {
		StringBuilder revString= new StringBuilder();// StringBuilder is new Java 5  Non-synchronised(performant) class
		char[] chars = str.toCharArray();
		/*for (int i = 0; i <chars.length ; i++) { // another way
			revString.insert(0,chars[i]);
		}*/
		for(char letter :chars){
			revString.insert(0,letter);
		}
		System.out.println("Reverse using insert method "+revString);
	}

	private static void reverseStringUsingBuilder(String str) {
		StringBuilder stringBuilder= new StringBuilder(str);
		System.out.println("Using reverse method "+stringBuilder.reverse());
	}

	static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
	
	
/*	1st Call ->   recursiveMethod("MyJava")
	2nd Call -> recursiveMethod("yJava") + "M"
	3rd Call ->  (recursiveMethod("Java") + "y") + "M"
	4th call ->  ((recursiveMethod("ava") + "J")+"y") + "M"
	5th Call ->  (((recursiveMethod("va") + "a") + "J")+"y") + "M"
	6th Call ->  ((((recursiveMethod("a") + "v") + "a") + "J")+"y") + "M"*/
	
	
	/*This method takes the first character of a string (str.charAt(0)) and puts it at the end of the string. And then calls itself on the remainder of the string (str.substring(1)).
	 *  Finally adds these two things to get the reverse of the passed string (recursiveMethod(str.substring(1)) + str.charAt(0)).
	 *   When the passed string is one character or less (str.length() <= 1), it stops calling itself and just returns the string passed.
*/
}
