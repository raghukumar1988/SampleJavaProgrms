package collections;

import collections.sorting.model.Country;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class HashmapIteration4 {
    public static void main(String[] args) {
        Map<Integer, Country> map = new HashMap<Integer, Country>();
        map.put(100, new Country(12, "India"));
        map.put(101, new Country(7, "HongKnog"));
        map.put(55, new Country(45, "Burma"));
        map.put(45, new Country(11, "Nigeria"));
        for (Map.Entry<Integer, Country> entry : map.entrySet()) { //iterating based on map entry
            System.out.println("from EntrySet Key-->" + entry.getKey() + "Value-->" + entry.getValue().getCountryName());
        }
        System.out.println();
        for (Integer key : map.keySet()) {//iterating based on map keys
            System.out.println("from keyset-->" + map.get(key).getCountryName());
        }
        System.out.println();
        for (Country val : map.values()) {// iterating based on map values
            System.out.println("from values--->" + val.getCountryName());
        }
        System.out.println();
        map.forEach((key, val) -> System.out.println(key + "   " + val.getCountryId() + " *********** " + val.getCountryName()));

    }
}  