package java8features;

/*An interface with only single abstract method is called functional interface for example: Runnable, callable*/

/*Along with the one abstract method, they can have any number of default and static methods.*/

/*Functional interface  can  be used as the assignment target for a lambda expression or method reference.*/

@FunctionalInterface
interface CustomInterface{
	  //String sayHello();
	  //Integer getPhoneNumber(int number );
	  String sconcat(String a, String b);
}

public class FunInterfaceExample1 {

	public static void main(String[] args) {
/*		//CustomInterface cusInterface=()->{return "Hello";};
        CustomInterface cusInterface=()-> "hello";
		System.out.println(cusInterface.sayHello());*/
        /*******************************/
/*		//CustomInterface cinter=(x)->{System.out.println("Test");return x;};
        CustomInterface cinter=(x)-> x;
		System.out.println(cinter.getPhoneNumber(24342));*/
		/*******************************/
		//CustomInterface cinter=(x,y)->x+y;
		CustomInterface cinter=(x, y)->{
			System.out.println("Strings Entered: "+x+" , "+y);
			return x+y;
		};
		System.out.println("Appended string:"+cinter.sconcat("Raghu","Kumar"));
        /*******************************/
	}





}
