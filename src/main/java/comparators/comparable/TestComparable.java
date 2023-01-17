package comparators.comparable;

import comparators.Country;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {

        /*With Custom TYpe*/
        List<AccountDetails> accountDetailsList = new ArrayList<>();
        // Hint - How do I initialize the long with the value 12345678910?
        //Answer: You should add L: long i = 12345678910L;
        //2) Are all numeric literals by default of type int? Answer : Yes

        accountDetailsList.add(new AccountDetails(43987543L,"Raghu",2344.45,true));
        accountDetailsList.add(new AccountDetails(23987543L,"Raja",344.45,false));
        accountDetailsList.add(new AccountDetails(73987543L,"Ramu",5344.45,true));
        accountDetailsList.add(new AccountDetails(33987543L,"Hari",1344.45,false));

        // uncomment different implementations and check the results
        accountDetailsList.forEach(accountDetail -> System.out.println("Before sort "+accountDetail));
        System.out.println("----------");
        Collections.sort(accountDetailsList); // used with comparable, for comparator list.sort is recommended
        accountDetailsList.forEach(accountDetail -> System.out.println("after sort "+accountDetail));
        //System.out.println("Before sort "+ accountDetailsList);// another way to print
        System.out.println("*********");


        /*With Primitive TYpe 1 */
        List<String> accountHolderNameList= new ArrayList<>();
        accountHolderNameList.add("Raghu");
        accountHolderNameList.add("Ajay");
        accountHolderNameList.add("Aahmed");
        accountHolderNameList.add("Jack");
        accountHolderNameList.forEach((accountHolderName -> System.out.println("Before Sort " +accountHolderName)));
        System.out.println("----------");
        Collections.sort(accountHolderNameList);
        accountHolderNameList.forEach(accountHolderName-> System.out.println("After Sort "+accountHolderName));
        System.out.println("----------");
        Collections.reverse(accountHolderNameList); // IMPORTANT
        accountHolderNameList.forEach(accountHolderName-> System.out.println("After Reverse "+accountHolderName));
        System.out.println("***********");


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
        //Arrays Sort1
        String[] strArr= {"Baja","Sama","Gamu","Aaja"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println("----------");
        System.out.println(Arrays.toString(strArr));
        System.out.println("***********");


        //Arrays Sort2
        Country[] conArr=new Country[3];
        conArr[0]=new Country(12, "Zndia");
        conArr[1]=new Country(3, "German");
        conArr[2]=new Country(1, "Neoal");
        System.out.println("Raww--"+Arrays.toString(conArr));
        System.out.println("----------");
        Arrays.sort(conArr);
        System.out.println("after Sort--"+Arrays.toString(conArr));
        System.out.println("***********");
    }
}
