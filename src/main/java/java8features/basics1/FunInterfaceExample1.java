package java8features.basics1;

/*An interface with only single abstract method is called functional interface for example: Runnable, callable*/

/*Along with the one abstract method, they can have any number of default and static methods.*/

/*Functional interface  can  be used as the assignment target for a lambda expression or method reference.*/

/*  1. Define FI
	2. Provide implementation
	3. Invoke method in FI  */

@FunctionalInterface
interface CustomFunctionalInterface {
	  //String sayHello();
	  //Integer getPhoneNumber(int number );
	  String sconcat(String a, String b);
}

public class FunInterfaceExample1 {

	public static void main(String[] args) {
/*		//CustomFunctionalInterface cusInterface=()->{return "Hello";};
        CustomFunctionalInterface cusInterface=()-> "hello";
		System.out.println(cusInterface.sayHello());*/


/*		//CustomFunctionalInterface cinter=(x)->{System.out.println("Test");return x;};
        CustomFunctionalInterface cinter=(x)-> x;
		System.out.println(cinter.getPhoneNumber(24342));*/


		//CustomFunctionalInterface cinter=(x,y)->x+y;
		CustomFunctionalInterface cinter=(x, y)->{
			System.out.println("Strings Entered: "+x+" , "+y);
			return x+y;
		};
		System.out.println("Appended string:"+cinter.sconcat("Raghu","Kumar"));
	}





}
