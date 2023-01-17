package enums.example1;

public class EnumExample1 {
	public static void main(String[] args) {
		benefitsOfEnumOverConstants();
	}

	/* Constants defined using enum makes the code more readable,
	allow for compile-time checking,
	document the list of accepted values upfront,
	and avoid unexpected behavior due to invalid values being passed in. */
/**
* This method shows the benefit of using Enum over Constants
*/
private static void benefitsOfEnumOverConstants() {
	//Enum values are fixed
	simpleEnumExample(ThreadStatesEnum12.START);
	simpleEnumExample(ThreadStatesEnum12.WAITING);
	simpleEnumExample(ThreadStatesEnum12.RUNNING);
	simpleEnumExample(ThreadStatesEnum12.DEAD);
	simpleEnumExample(null);
		
	simpleConstantsExample(1);
	simpleConstantsExample(2);
	simpleConstantsExample(3);
	simpleConstantsExample(4);
	//we can pass any int constant
	simpleConstantsExample(5);
}

private static void simpleConstantsExample(int i) {
	if(i == ThreadStatesConstant11.START) System.out.println("Thread started");
	else if (i == ThreadStatesConstant11.WAITING) System.out.println("Thread is waiting");
	else if (i == ThreadStatesConstant11.RUNNING) System.out.println("Thread is running");
	else System.out.println("Thread is dead");
}

private static void simpleEnumExample(ThreadStatesEnum12 th) {
	if(th == ThreadStatesEnum12.START) System.out.println("Thread started");
	else if (th == ThreadStatesEnum12.WAITING) System.out.println("Thread is waiting");
	else if (th == ThreadStatesEnum12.RUNNING) System.out.println("Thread is running");
	else System.out.println("Thread is dead");
}



}
