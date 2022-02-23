package java8features;


/*Refer: https://beginnersbook.com/2017/10/java-8-features-with-examples/ */
interface FirstInterface {
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
		System.out.println("Inside Second");
	}
}

class DefaultAndStatic3 implements FirstInterface, SecondInterface, ThirdInterface {
	public static void main(String[] args) {
		DefaultAndStatic3 te = new DefaultAndStatic3();
		te.showText();
		
		//ThirdInterface.viewText();
	}

	@Override
	public void showText() {
		 //non static methods and variables need to be  accessed using . operator -IMPORTANT
		FirstInterface.super.showText();//to call super implementation- as it has same method names in both Interfaces
		SecondInterface.super.showText();
		ThirdInterface.viewText();
	}
	
	
/*	1.Two interfaces having default methods with same name which is causing CTE(compile)
	2.To avoid above, overide method in implemented class
	3.Non static(instance) method called via super
	4.static methods called via class name
	5.Purpose of static keyword doesn't changed-- to define class level members: fields, methods etc.
	In Java 8 this behavior was expanded to Interfaces, so they become more similar to classes and now can replace class in most scenarios.*/
	

}
