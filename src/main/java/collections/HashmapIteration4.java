package collections;

import comparators.Country;

import java.util.HashMap;
import java.util.Map;

class HashmapIteration4 {  
 public static void main(String args[]){  
     Map<Integer, Country> map=new HashMap<Integer, Country>();
	//Map<Integer,Country> map=new ConcurrentHashMap<Integer,Country>();  
  map.put(100,new Country(12, "India"));
  map.put(101,new Country(7, "HongKnog"));
  map.put(55,new Country(45, "Burma"));
  map.put(45,new Country(11, "Nigeria"));
  for(Map.Entry<Integer, Country> entry:map.entrySet()) { //iterating based on map entires
	  System.out.println("from EntrySet Key-->"+entry.getKey()+"Value-->"+entry.getValue().getCountyrName());
	 // map.put(35,new Country(15, "Dubai"));
	 // map.remove(45);
  }
  for(Integer key:map.keySet()) {//iterating based on map keys
	  System.out.println("from keyset-->"+map.get(key).getCountyrName());
  }
  
  for(Country val:map.values()) {// iterating based on map values
	  System.out.println("from values--->"+val.getCountyrName());
  }
  
  map.forEach((key,val)-> System.out.println(key+"   "+val.getCountryId()+" *********** "+val.getCountyrName()));
 
 }  
}  