package basicPrograms;

import java.util.Arrays;

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
}
