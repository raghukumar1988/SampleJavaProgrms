package collections;

import comparators.Country;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConCurrentHashmap5 {
	public static void main(String args[]) {
		//Map<Integer,Country> map=new HashMap<Integer,Country>();//Uncomment this to see the exception
		Map<Integer, Country> map = new ConcurrentHashMap<Integer, Country>();
		map.put(100, new Country(12, "India"));
		map.put(101, new Country(7, "HongKnog"));
		map.put(55, new Country(45, "Burma"));
		map.put(45, new Country(11, "Nigeria"));
		for (Map.Entry<Integer, Country> entry : map.entrySet()) { // iterating based on map entires
			System.out.println("from EntrySet Key-->" + entry.getKey() + "Value-->" + entry.getValue().getCountryName());
			if(!map.keySet().contains(35)) {
			map.put(35, new Country(15, "Dubai"));
			System.out.println("Inserted Dubai");
			}
			map.remove(45);
		}

		map.forEach((key, val) -> System.out.println("Key-->"+key + " Country Name--> " + val.getCountryName()));

	}
}