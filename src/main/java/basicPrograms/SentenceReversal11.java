package basicPrograms;

import java.util.regex.Pattern;

public class SentenceReversal11 {
    public static void main(String[] args) {
        System.out.println(reverseWordsUsingString("I love java programming"));
        System.out.println(reverseWordsUsingStringEnhancedForLoop("I love java programming"));
        System.out.println(reverseWordsUsingStringBuilder("I love java programming"));
    }

    private static String reverseWordsUsingStringBuilder(String str) {
        StringBuilder finalStr = new StringBuilder();
        Pattern pattern= Pattern.compile("\\s");
        String[] words = pattern.split(str);
        for (String word:words) {
            finalStr.insert(0," " +word);
        }
        return finalStr.toString();
    }

    // using string
    private static String reverseWordsUsingString(String str) {
        String reversedString= "";
        Pattern pattern= Pattern.compile("\\s");
        String[] words = pattern.split(str);

        for (int i = 0; i < words.length; i++) {
            if(i== words.length-1){ // Note this condition is not possible with enhanced for loop
                reversedString= words[i]+reversedString ;
            }else{
                reversedString= " "+ words[i]+reversedString ;
            }

        }
        return reversedString;
    }
    // using for each loop
    private static String reverseWordsUsingStringEnhancedForLoop(String str) {
        String reversedString= "";
        Pattern pattern= Pattern.compile("\\s");
        String[] words = pattern.split(str);
        for(String word:words){
            reversedString= " "+ word + reversedString;
        }
        return reversedString;
    }


}
