package collections;

import java.util.HashMap;

public class HashmapExample31 {
    public static void main(String[] args) {
        //1. Creating HashMap with default initial capacity and load factor
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();

        //2. Creating HashMap with 30 as initial capacity
        HashMap<String, Integer> map2 = new HashMap<String, Integer>(30);

        //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor; Load Factor -  As the number of elements in the HashMap increases, the capacity is expanded.
        // The load factor is the measure that decides when to increase the capacity of the Map. The default load factor is 75% of the capacity.
        HashMap<String, Integer> map3 = new HashMap<String, Integer>(30, 0.5f);

        //4. Creating HashMap by copying another HashMap
        HashMap<String, Integer> map4 = new HashMap<String, Integer>(map1);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);
        map.putIfAbsent("ONE", 111);  //Adds key-value pair 'ONE-111' only if it is not present in map
        map.forEach((k, v) -> System.out.println("k = " + k + " v = " + v));

        System.out.println("Getting the value for Key TWO --> "+map.get("TWO"));//Retrieving a value associated with key 'TWO'
        System.out.println("Check if Map contains Key ONE --> "+map.containsKey("ONE")); //Checking whether key  exist in map
        System.out.println("Check if Map contains value 2 --> "+map.containsValue(2));//Checking whether value  exist in map
        System.out.println("Map Size BEFORE clearing--> "+map.size()); // Checking the number of key-value pairs before clearing the map
        map.clear();   //Clearing the map
        System.out.println("Map Size AFTER clearing--> "+ map.size()); //Checking the number of key-value pairs after clearing the map


      /*  How to Design a Good Key for HashMap? map keys should be immutable  ;
      This is the main reason why immutable classes like String, Integer or other wrapper classes are good candidates for creating the Map Keys.*/


    }/* Equals hashcode contract - Must go -> https://howtodoinjava.com/java/basics/java-hashcode-equals-methods/
        If two objects are equal according to the equals() method, then calling the hashCode() on each of the two objects must produce the same integer result.
It is not required that if two objects are unequal according to the equals(), then calling the hashCode() on each of the both objects must produce distinct integer results.
However, the programmer should be aware that producing distinct integer results for unequal objects may improve the performance of hash tables.
*/
    /*https://howtodoinjava.com/interview-questions/hashmap-concurrenthashmap-interview-questions/*/
}
