package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CopyOnWriteArrayIistExample2 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		//List<String> nameList = new CopyOnWriteArrayList<>();  // Way 1
		nameList.add("Raghu");
		nameList.add("Raji");
		nameList.add("Kuruvi");
		nameList.add("Nithran");
		nameList.add("Sonu");
		nameList.add("Sonu1");
		for (String name : nameList) {
			System.out.println(" default iteration name = " + name);
		}
		System.out.println();
		for (String name : nameList) { // leads to concurrent modification error
			if (name.equalsIgnoreCase("Sonu")) {
				nameList.remove(name);
			}
			System.out.println("iteration with deletion  = " + name);
		}
		System.out.println();

		nameList.removeIf(s -> s.equalsIgnoreCase("Sonu")); // way 2
		for (String s : nameList) {
			System.out.println("Name after remove if  = " + s);
		}
		System.out.println();

		nameList.remove("Sonu1");  // Way 3
		for (String s : nameList) {
			System.out.println("Name after remove  = " + s);
		}
		System.out.println();

		List<String> filteredList = nameList.stream().filter(s -> !s.equalsIgnoreCase("Nithran")).collect(Collectors.toList());// Way 4
		for (String s : filteredList) {
			System.out.println("removal with Streams = " + s);
		}

	}

}
