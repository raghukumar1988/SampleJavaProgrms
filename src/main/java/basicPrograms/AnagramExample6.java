package basicPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class AnagramExample6 {
    public static void main(String[] args) {
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("keEp", "peeK");
        isAnagram("SiLeNt CAT", "LisTen AcT");
        isAnagram("Debit Card", "Bad Credit");
        isAnagram("School MASTER", "The ClassROOM");
        isAnagram("DORMITORY", "Dirty Room");
        isAnagram("ASTRONOMERS", "NO MORE STARS");
        isAnagram("Toss", "Shot");
        isAnagram("joy", "enjoy");
        System.out.println(isAnagram2("joy", "enjoy"));
        System.out.println(isAnagram2("keEp", "peeK"));
    }

    private static void isAnagram(String str1, String str2) {
        boolean isAnagram = true;
        String inputStr1 = str1.replace("\\s", "");
        String inputStr2 = str2.replace("\\s", "");
        if (inputStr1.length() != inputStr2.length()) {
            isAnagram = false;
        } else {
            char[] charArray1 = inputStr1.toLowerCase().toCharArray();
            char[] charArray2 = inputStr2.toLowerCase().toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            isAnagram = Arrays.equals(charArray1, charArray2);
            if (isAnagram) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }
    }


    public static boolean isAnagram2(String str1, String str2) {
         String inputStr1 = str1.replace("\\s", "");
        String inputStr2 = str2.replace("\\s", "");
        if (inputStr1.length() != inputStr2.length()) {
            return false;
        }
        // Create a HashMap containing Character as Key and Integer as Value.
        HashMap<Character, Integer> map = new HashMap<>();
        // Loop over all character of String a and put in HashMap.
        for (int i = 0; i < inputStr1.length(); i++) {
            // Check if HashMap already contain current character or not
            if (map.containsKey(inputStr1.charAt(i))) {
                // If contains increase count by 1 for that character
                map.put(inputStr1.charAt(i), map.get(inputStr1.charAt(i)) + 1);
            }
            else {
                map.put(inputStr1.charAt(i), 1);
            }
        }
        // Now loop over String b
        for (int i = 0; i < inputStr2.length(); i++) {
            if (map.containsKey(inputStr2.charAt(i))) {
                // If contains reduce count of that
                // character by 1 to indicate that current
                // character has been already counted as
                // idea here is to check if in last count of
                // all characters in last is zero which
                // means all characters in String a are
                // present in String b.
                map.put(inputStr2.charAt(i), map.get(inputStr2.charAt(i)) - 1);
            }
            else {
                return false;
            }
        }
        // Extract all keys of HashMap/map
        Set<Character> keys = map.keySet();
        // Loop over all keys and check if all keys are 0.
        // If so it means it is anagram.
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        // Returning True as all keys are zero
        return true;
    }
}
