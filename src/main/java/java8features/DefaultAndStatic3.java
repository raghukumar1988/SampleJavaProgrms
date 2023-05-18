package java8features;


/*Refer: https://beginnersbook.com/2017/10/java-8-features-with-examples/ */
interface FirstInterface {
	void readText();
	default void showText() {
		System.out.println("Inside FirstInterface");
	}
}

interface SecondInterface {
	default void showText() {// method is non-static
		System.out.println("Inside Second");
	}
}

interface ThirdInterface {
	static void viewText() {
		System.out.println("Inside Third");
	}
}

class DefaultAndStatic3 implements FirstInterface, SecondInterface, ThirdInterface {
	public static void main(String[] args) {
		DefaultAndStatic3 te = new DefaultAndStatic3();
		te.readText();// normal interface implemented method
		te.showText();
		//ThirdInterface.viewText(); // to call static method

	}

	@Override
	public void readText() {
		System.out.println("Reading text from Interface 1");
	}

	@Override // either you can reuse the existing implementation or define your own
	public void showText() {
		//FirstInterface.super.showText(); //to reuse the implementation of FirstInterface
		SecondInterface.super.showText(); //to reuse the implementation of SecondInterface
		viewText(); //to call static method
		System.out.println("Some custom implementation");

	}
	
	
/*
       The most common use of interface default methods is to incrementally provide additional functionality
        to a given type without breaking down the implementing classes.
	1.Implementing two interfaces with same default methods will end up in  CTE(compile)
	2.To avoid above, override method in implemented class
	3. If you want to use any of existing default method implementation, we can call using super keyword.
	4. static methods can be invoked using the classname(similer to static methods in class)
	5.Purpose of static keyword doesn't changed-- to define class level members: fields, methods etc.
	In Java 8 this behavior was expanded to Interfaces, so they become more similar to classes and now can replace class in most scenarios.*/
	

}
