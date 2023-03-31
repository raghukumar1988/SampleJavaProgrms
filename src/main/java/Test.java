// 1. Extending the Thread class. 

class Test {

    public static void main(String[] args) {
        checkifPalindrome("MOM");
        checkifPalindrome("131");
        checkifPalindrome("12321");
        checkifPalindrome("123");
        checkifPalindrome("DADDY");
    }

    private static void checkifPalindrome(String originalString) {
        String reversedString = reverseString(originalString);
        if(reversedString.equals(originalString)){
            System.out.println(originalString +" is Palindrome");
        }else{
            System.out.println(originalString +" is not Palindrome");
        }
    }

    private static String reverseString(String stringtoReverse) {
        char[] chars = stringtoReverse.toCharArray();
        StringBuilder reversedString= new StringBuilder();
        for(char letter:chars){
            reversedString.insert(0,letter);
        }
        return reversedString.toString();
    }


}


