package java8features;

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
		al.forEach(new Consumer<Integer>() {   //Type1:actual forEach with Anonymous Consumer Parameter

			@Override
			public void accept(Integer t) {
				System.out.println("Printing anonomouslyy-->"+t);

			}

		});
		
		
		List<String> strlist=new ArrayList<>();
		strlist.add("Raghu");
		strlist.add("Samu");
		strlist.add("Aamu");
		strlist.add("Bamu");
		strlist.forEach(str->System.out.println("Using Lamba Expression-->"+str)); //Type2: Simplified with Lamba Expression
		
		Myconsumer mycon=new Myconsumer();
		strlist.forEach(mycon);  //Type 3:actual forEach with implemented Consumer Parameter
		
		
	}
	
	
}

class Myconsumer implements Consumer<String>{

   @Override
   public void accept(String t) {
       System.out.println("Printing by implementation -->"+t);

   }

}
