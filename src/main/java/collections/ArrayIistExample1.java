package collections;

import java.util.ArrayList;
import java.util.Collections;
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

       /*Reverse List Way1:*/
		ListIterator<String> listIterator=al.listIterator(); // This will not work as the the index points to the beginning of the list.
		while(listIterator.hasPrevious()){
			System.out.println("Reverse list Iterator(default) = " + listIterator.previous());
		}

		ListIterator<String> listIteratorWithSize=al.listIterator(al.size()); // This works, as the the index points to the last  index
		while(listIteratorWithSize.hasPrevious()){
			System.out.println("Reverse list Iterator(With Size arg) = " + listIteratorWithSize.previous());
		}
		System.out.println();

		/*Reverse List Way2:*/
		Collections.reverse(al);
		for (String testName : al) {
			System.out.println("testName = " + testName);
		}

		System.out.println();
        Collections.reverse(al); // Reversing again
		/*Using Java8:*/
		al.forEach(string -> System.out.println("for each-->" + string)); //using forEach Method

	}

}
