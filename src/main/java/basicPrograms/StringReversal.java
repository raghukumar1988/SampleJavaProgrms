package basicPrograms;

/*https://javaconceptoftheday.com/java-program-to-reverse-a-string/
*/
public class StringReversal {

	public static void main(String[] args) {
		String sf = "Raghu";
		// String rs = "";
		StringBuffer rs = new StringBuffer();
		char[] charArray = sf.toCharArray();
		System.out.println(sf);
		for (int i = charArray.length - 1; i >= 0; i--) {
			// System.out.print(charArray[i]); //using print method
			// rs += charArray[i]; //using assignment operator
			rs.append(charArray[i]); // using StringBuffer append method
		}
		System.out.println(rs);
		System.out.println("Revrese using recursive  "+recursiveMethod("MyJava"));

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
