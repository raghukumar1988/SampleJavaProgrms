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

    private static List<Entry<Character, Integer>> sortMapByValue(Map<Character, Integer> map) {

        Set<Entry<Character, Integer>> set = map.entrySet(); // getting entryset and saving in Set
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


    /* Suppose you were creating a mapping of names to Person objects.
    You might want to periodically output the people in alphabetical order by name.
    A TreeMap lets you do this.

    A TreeMap also offers a way to, given a name, output the next 10 people.
    This could be useful for a “More” function in many applications.

    A LinkedHashMap is useful whenever you need the ordering of keys to match the ordering of insertion.
    This might be useful in a caching situation, when you want to delete the oldest item.

    Generally, unless there is a reason not to, you would use HashMap.

    That is, if you need to get the keys back in insertion order, then use LinkedHashMap.
    If you need to get the keys back in their true/natural order, then use TreeMap.
    Otherwise, HashMap is probably best. It is typically faster and requires less overhead.*/
}
