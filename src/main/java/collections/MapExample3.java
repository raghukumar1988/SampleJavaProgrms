package collections;

import java.util.Map;
import java.util.TreeMap;

public class MapExample3 {

	public static void main(String[] args) {
//Map<Integer,String> texMap=new HashMap<>();
//Map<Integer,String> texMap=new LinkedHashMap<>();//maintains insertion order
Map<Integer,String> texMap=new TreeMap<>();//maintains ascending order
texMap.put(1, "One");
texMap.put(2, "Two");
texMap.put(3, "Three");
texMap.put(3, "Four");//**Overwrite if hashmap key is same key
texMap.put(4, "Four");
texMap.put(5, null);//treemap wont allow null key but allow null values
texMap.put(6, null);
/*texMap.put(null, "Value");//keys should be unique and can contain one null for HashMap&LinkedHashMap
texMap.put(null, "Value");//values can be duplicate and can contain multiple null
*/
texMap.forEach((key,value)->System.out.println("key-->"+key+" value-->"+value));

	}

}
