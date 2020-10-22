package comparators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		// Custom Types 
		List<Country> al = new ArrayList<Country>();
		al.add(new Country(23, "India"));
		al.add(new Country(12, "Nepal"));
		al.add(new Country(33, "Singapore"));
		al.add(new Country(24, "Malaysia"));
		al.forEach(county -> System.out.println("before Sort::" + county.getCountryId() + "  " + county.getCountyrName()));
		Collections.sort(al); /* Underlying Country class implements Comparable Interface */
		al.forEach(country -> System.out.println("After Sort::" + country.getCountryId() + " " + country.getCountyrName()));

		///Primitive Types 1
		List<String> al1 = new ArrayList<String>();
		al1.add("India");
		al1.add("Nepal");
		al1.add("Singapore");
		al1.add("Malaysia");
		al1.forEach(county -> System.out.println("before Sort::" + county));
		Collections.sort(al1);  /* By default String Wrapper class implements Comparable Interface */
		al1.forEach(county -> System.out.println("After Sort::" + county));
		
		// Primitive Types 2
		List<Integer> al2 = new ArrayList<Integer>();
		al2.add(23);
		al2.add(11);
		al2.add(9);
		al2.add(4);
		al2.forEach(county -> System.out.println("before Sort::" + county));
		Collections.sort(al2);/* By default All Wrapper classes implements Comparable Interface */
		al2.forEach(county -> System.out.println("After Sort::" + county));
		
		//Arrays Sort1
		String[] strArr= {"Baja","Sama","Gamu","Aaja"};
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		//Arrays Sort2
		Country[] conArr=new Country[3];
		conArr[0]=new Country(12, "Zndia");
		conArr[1]=new Country(3, "German");
		conArr[2]=new Country(1, "Neoal");
		System.out.println("Raww--"+Arrays.toString(conArr));
		Arrays.sort(conArr);
		System.out.println("after Sort--"+Arrays.toString(conArr));
		
		
		

	}

}
