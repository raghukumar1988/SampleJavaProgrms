package java8features;

/*An interface with only single abstract method is called functional interface for example: Runnable, callable*/

/*Along with the one abstract method, they can have any number of default and static methods.*/

@FunctionalInterface
interface CustomInterface{
	//String sayHello();
	//Integer getPhoneNumber(int number );  
	  String sconcat(String a, String b);
}

public class FunInterfaceExample1 {

	public static void main(String[] args) {
	/*	CustomInterface cinter=()->{return "Hello";};
		System.out.println(cinter.sayHello());*/
		
/*		CustomInterface cinter=(x)->{return x;};
		System.out.println(cinter.getPhoneNumber(24342));*/
		
		//CustomInterface cinter=(x,y)->x+y;
		CustomInterface cinter=(x, y)->{
			System.out.println("Strings Entered: "+x+" and "+y);
			return x+y;
		};
		System.out.println("Appended string:"+cinter.sconcat("Raghu","Kumar"));
	}
	
	
	
	/*Refer: https://beginnersbook.com/2017/10/java-8-features-with-examples/ */

}
