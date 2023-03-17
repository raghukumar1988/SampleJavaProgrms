package basicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString4 {
    public static void main(String[] args) {
        findDuplicateCharCount("Better Butter");
        findDuplicateCharCount("Fresh Fish");
    }

    private static void findDuplicateCharCount(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char letter : chars) {
            if (charMap.containsKey(letter)) {
                charMap.put(letter, charMap.get(letter) + 1);
            } else {
                charMap.put(letter, 1);
            }
        }
        Set<Character> characters = charMap.keySet();
        System.out.println("Duplicate letters in " + str);
        for (Character character : characters) {
            if (charMap.get(character) > 1) {
                System.out.println(character + " : " + charMap.get(character));
            }
        }
    }
}
