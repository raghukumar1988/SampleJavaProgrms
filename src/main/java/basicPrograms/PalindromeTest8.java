package basicPrograms;

public class PalindromeTest8 {
    public static void main(String[] args) {
        checkIfPalindrome("MOM");
        checkIfPalindrome("131");
        checkIfPalindrome("12321");
        checkIfPalindrome("123");
        checkIfPalindrome("DADDY");
    }

    private static void checkIfPalindrome(String originalString) {
        String reversedString = reverseString(originalString);
        if (reversedString.equals(originalString)) {
            System.out.println(originalString + " is Palindrome");
        } else {
            System.out.println(originalString + " is not Palindrome");
        }
    }

    private static String reverseString(String stringToReverse) {
        char[] chars = stringToReverse.toCharArray();
        StringBuilder reversedString = new StringBuilder();
        for (char letter : chars) {
            reversedString.insert(0, letter);
        }
        return reversedString.toString();
    }
}
