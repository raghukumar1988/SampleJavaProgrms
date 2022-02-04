package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayIistExample2 {

	public static void main(String[] args) {
		List<String> al = new CopyOnWriteArrayList<>();//to avoid concurrentModifictaion Exception
		//List<String> al = new ArrayList<>();//enable to see exception
		al.add("TEst1");
		al.add("TEst2");
		al.add("TEst3");
		al.add("TEst4");
		al.add("TEst5");
		al.add("TEst6");
		al.forEach(string -> System.out.println("for each before -->" + string));
		System.out.println();
		for (String string : al) {
			System.out.println("Printing Values--->" + string);
			if (string.equalsIgnoreCase("test4"))
				al.remove(string);
		}
		System.out.println();
		al.forEach(string -> System.out.println("for each after -->" + string));

	}

}
