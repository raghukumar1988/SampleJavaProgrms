package java8features.basics1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*Refer: https://beginnersbook.com/2017/10/java-8-features-with-examples/ */

public class ForEachMethod2 {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(11);
		al.add(15);
		al.add(333);
		al.add(345);

		//Type1:actual forEach with Anonymous Consumer Parameter
		al.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("Printing with Anonymous Consumer: Type1 -->"+t);

			}

		});

		List<String> strlist=new ArrayList<>();
		strlist.add("Raghu");
		strlist.add("Samu");
		strlist.add("Aamu");
		strlist.add("Bamu");

		//Type2: Simplified with Lamba Expression
		strlist.forEach(str->System.out.println("Using Lamba Expression: Type2 -->"+str));
		strlist.forEach(System.out::println); // Use method reference,if you want to print only the values

		//Type 3:actual forEach with implemented Consumer Parameter
		Myconsumer mycon=new Myconsumer();
		strlist.forEach(mycon);
	}


}

class Myconsumer implements Consumer<String>{
   @Override
   public void accept(String t) {
       System.out.println("Printing by implementation : Type 3 -->"+t);

   }

}


