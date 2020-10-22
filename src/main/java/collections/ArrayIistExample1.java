package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayIistExample1 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();/*test*/
		al.add("TEst1");
		al.add("TEst2");
		al.add("TEst3");
		al.add("TEst4");
		al.add("TEst5");

		ListIterator<String> listItr = al.listIterator();
		while (listItr.hasNext()) {//forward iteartion
			System.out.println(listItr.next());
		}
		System.out.println();
		while (listItr.hasPrevious()) {//reverse iteartion
			System.out.println(listItr.previous());
		}
		System.out.println();
		al.forEach(string -> System.out.println("for each-->" + string)); //using forEach Method

	}
}
