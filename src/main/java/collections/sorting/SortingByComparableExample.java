package collections.sorting;



import collections.sorting.model.AccountDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingByComparableExample {
    public static void main(String[] args) {

        sortCustomAccountDetailsListByComparable();
        sortingPrimitiveListUsingSortMethodOfCollections();
        sortingPrimitiveListUsingSortMethodOfCollections2();
        sortingArrayUsingSortMethodOfArrays();
        sortingArrayUsingSortMethodOfArrays2();
    }

    private static void sortingArrayUsingSortMethodOfArrays2() {
        //Arrays Sort2
        AccountDetails[] conArr = new AccountDetails[4];
        conArr[0] = new AccountDetails(43987543L, "Raghu", 2344.45, true);
        conArr[1] = new AccountDetails(23987543L, "Raja", 344.45, false);
        conArr[2] = new AccountDetails(73987543L, "Ramu", 5344.45, true);
        conArr[3] = new AccountDetails(33987543L, "Hari", 1344.45, false);
        System.out.println("Raww--" + Arrays.toString(conArr));
        System.out.println("----------");
        Arrays.sort(conArr); // sorts based on compareTo implementation
        System.out.println("after Sort--" + Arrays.toString(conArr));
        System.out.println("***********");
    }

    private static void sortingArrayUsingSortMethodOfArrays() {
        //Arrays Sort1
        String[] strArr = {"Baja", "Sama", "Gamu", "Aaja"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println("----------");
        System.out.println(Arrays.toString(strArr));
        System.out.println("***********");
    }

    private static void sortingPrimitiveListUsingSortMethodOfCollections2() {
        // Primitive Types 2
        List<Integer> al2 = new ArrayList<Integer>();
        al2.add(23);
        al2.add(11);
        al2.add(9);
        al2.add(4);
        al2.forEach(number -> System.out.println("Primitive Type 2 before Sort::" + number));
        System.out.println("----------");
        Collections.sort(al2);/* By default All Wrapper classes implements Comparable Interface */
        al2.forEach(number -> System.out.println("Primitive Type 2 After Sort::" + number));
        System.out.println("***********");
    }

    private static void sortingPrimitiveListUsingSortMethodOfCollections() {
    /* NOTE --> Don't get confused with list.sort which takes comparator impl as arg
     Recommended - list.sort(Comparator)
     Not Recommended - Collections.sort(accountDetailsList,Comparator); */

        /*With Primitive TYpe 1 */
        List<String> accountHolderNameList = new ArrayList<>();
        accountHolderNameList.add("Raghu");
        accountHolderNameList.add("Ajay");
        accountHolderNameList.add("Aahmed");
        accountHolderNameList.add("Jack");
        accountHolderNameList.forEach((accountHolderName -> System.out.println("Before Sort " + accountHolderName)));
        System.out.println("----------");
        Collections.sort(accountHolderNameList);
        accountHolderNameList.forEach(accountHolderName -> System.out.println("After Sort " + accountHolderName));
        System.out.println("----------");
        Collections.reverse(accountHolderNameList); // IMPORTANT
        accountHolderNameList.forEach(accountHolderName -> System.out.println("After Reverse " + accountHolderName));
        System.out.println("***********");
    }

    private static void sortCustomAccountDetailsListByComparable() {
        List<AccountDetails> accountDetailsList = new ArrayList<>();
        /*
        1) How do I initialize the long with the value 12345678910?
        Answer: You should add L in end ; Ex -> long i = 12345678910L;

        2) Are all numeric literals by default of type int?
        Answer : Yes
        */
        accountDetailsList.add(new AccountDetails(43987543L, "Raghu", 2344.45, true));
        accountDetailsList.add(new AccountDetails(23987543L, "Raja", 344.45, false));
        accountDetailsList.add(new AccountDetails(73987543L, "Ramu", 5344.45, true));
        accountDetailsList.add(new AccountDetails(33987543L, "Hari", 1344.45, false));

        // uncomment different compareTo implementations in AccountDetails model and check the results
        // The limitation of comparable is it allows only single sorting impl
        accountDetailsList.forEach(accountDetail -> System.out.println("Before sort " + accountDetail));
        System.out.println("----------");
        Collections.sort(accountDetailsList);
        accountDetailsList.forEach(accountDetail -> System.out.println("after sort " + accountDetail));
        System.out.println("*********");
    }
}
