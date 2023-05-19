package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample6 {

    public static void main(String[] args) {
//Set<String> setex= new HashSet<String>();//random order and all 3 wont allow duplicates
        Set<String> setex = new LinkedHashSet<String>();  //maintains insertion order
//Set<String> setex= new TreeSet<String>();  //maintains ascending order
        setex.add("SET");
        setex.add("MAS");
        setex.add("MAS");//duplicate values will be overidden(i.e MAS and null)
        setex.add("ZAX");
        setex.add("SET");
        setex.add(null);//both HashSet,LinkedHashSet allow one null value
        setex.add(null);//TreeSet wont allow null values
        setex.forEach(tex -> System.out.println(tex));

    }

}
