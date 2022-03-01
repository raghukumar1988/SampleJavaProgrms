package string;

import java.util.*;
import java.util.Map.Entry;

public class StringInterview1 {
    public static void main(String args[]) {
        String str = "BABABLACKSHEEP";
        System.out.println(findDuplicatewithSort(str));  // 1P1C1S1H1K1L2E3A3B
    }

    private static String findDuplicatewithSort(String str) {
        String finalString = "";
        char[] charArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) { // Iterate charArray and moving to Map

            if (map.containsKey(charArray[i])) {
                map.put(charArray[i], map.get(charArray[i]) + 1); // for duplicate char increments count by 1
            } else {
                map.put(charArray[i], 1);
            }
        }
        List<Entry<Character, Integer>> sorted = sortMapByValue(map);
        for (Entry<Character, Integer> entry : sorted) {
            finalString += entry.getValue() + "" + entry.getKey();
        }
        return finalString;
    }

    private static List<Entry<Character, Integer>> sortMapByValue(Map<Character, Integer> treemap) {

        Set<Entry<Character, Integer>> set = treemap.entrySet(); // getting entryset and saving in Set
        List<Entry<Character, Integer>> entries = new ArrayList<>(set);// Creates new list by passing set as arguments
        Collections.sort(entries, new Comparator<Entry<Character, Integer>>() { // Comparator anonymonus implementation

            @Override
            public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {

                // return o1.getValue().compareTo(o2.getValue());
                return o1.getValue() - o2.getValue();
            }
        });
        //Collections.sort(listforSort,(o1,o2)->o1.getValue()-o2.getValue());
        // Collections.sort(listforSort, Comparator.comparingInt(Map.Entry::getValue));

/*		Map<Character, Integer> sortedmap = new LinkedHashMap<>();
		for (Entry<Character, Integer> entry : entries) {
			sortedmap.put(entry.getKey(), entry.getValue()); //Putting sorted values in new map hashmap
		}*/

        return entries;
    }

}
