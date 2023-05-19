package collections;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class CopyOnWriteArrayIistExample2 {

    public static void main(String[] args) {
        iterateListAndPrint();
        //simulateConcurrentModificationException();
        fixConcurrentModificationExceptionUsingCOWArrayList();
        removeElementsInListUsingRemoveIfMethod();
        removeElementsBeforeTheIteration();
        removeElementsInListUsingStreams();
    }

    private static void removeElementsInListUsingStreams() {
        List<String> nameList4 = new ArrayList<>();
        //List<String> nameList = new CopyOnWriteArrayList<>();  // Way 1
        nameList4.add("Raghu");
        nameList4.add("Raji");
        nameList4.add("Kuruvi");
        nameList4.add("Nithran");
        nameList4.add("Sonu");
        nameList4.add("Sonu1");

        List<String> filteredList = nameList4.stream().filter(s -> !s.equalsIgnoreCase("Nithran")).collect(Collectors.toList());// Way 4
        for (String s : filteredList) {
            System.out.println("Removal with Streams = " + s);
        }
    }

    private static void removeElementsBeforeTheIteration() {
        List<String> nameList3 = new ArrayList<>();
        //List<String> nameList = new CopyOnWriteArrayList<>();  // Way 1
        nameList3.add("Raghu");
        nameList3.add("Raji");
        nameList3.add("Kuruvi");
        nameList3.add("Nithran");
        nameList3.add("Sonu");
        nameList3.add("Sonu1");

        nameList3.remove("Raji");  // Way 3
        for (String s : nameList3) {
            System.out.println("Remove elements before iteration  = " + s);
        }
        System.out.println();
    }

    private static void removeElementsInListUsingRemoveIfMethod() {
        List<String> nameList2 = new ArrayList<>();
        nameList2.add("Raghu");
        nameList2.add("Raji");
        nameList2.add("Kuruvi");
        nameList2.add("Nithran");
        nameList2.add("Sonu");
        nameList2.add("Sonu1");

        nameList2.removeIf(s -> s.equalsIgnoreCase("Raji")); // way 2
        for (String s : nameList2) {
            System.out.println("Removal using removeIf method  = " + s);
        }
        System.out.println();
    }

    private static void fixConcurrentModificationExceptionUsingCOWArrayList() {
        List<String> nameList = new CopyOnWriteArrayList<>();  // Notice impl type
        nameList.add("Raghu");
        nameList.add("Raji");
        nameList.add("Kuruvi");
        nameList.add("Nithran");
        nameList.add("Sonu");
        nameList.add("Sonu1");
        for (String name : nameList) { // leads to concurrent modification error
            if (name.equalsIgnoreCase("Raji")) {
                nameList.remove(name);
            }
            System.out.println("Removal with COW ArrayList  = " + name);
        }
        System.out.println();
    }

    private static void simulateConcurrentModificationException() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Raghu");
        nameList.add("Raji");
        nameList.add("Kuruvi");
        nameList.add("Nithran");
        nameList.add("Sonu");
        nameList.add("Sonu1");
        for (String name : nameList) { // leads to concurrent modification error
            if (name.equalsIgnoreCase("Raji")) {
                nameList.remove(name);
            }
            System.out.println("Removal inside for loop   = " + name);
        }
        System.out.println();
    }

    private static void iterateListAndPrint() {
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
    }

}
