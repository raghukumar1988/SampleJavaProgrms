package enums;

public class EnumExample {
	public static void main(String[] args) {
		benefitsOfEnumOverConstants();
	}
	

/**
* This method shows the benefit of using Enum over Constants
*/
private static void benefitsOfEnumOverConstants() {
	//Enum values are fixed
	simpleEnumExample(ThreadStatesEnum.START);
	simpleEnumExample(ThreadStatesEnum.WAITING);
	simpleEnumExample(ThreadStatesEnum.RUNNING);
	simpleEnumExample(ThreadStatesEnum.DEAD);
	simpleEnumExample(null);
		
	simpleConstantsExample(1);
	simpleConstantsExample(2);
	simpleConstantsExample(3);
	simpleConstantsExample(4);
	//we can pass any int constant
	simpleConstantsExample(5);
}

private static void simpleEnumExample(ThreadStatesEnum th) {
	if(th == ThreadStatesEnum.START) System.out.println("Thread started");
	else if (th == ThreadStatesEnum.WAITING) System.out.println("Thread is waiting");
	else if (th == ThreadStatesEnum.RUNNING) System.out.println("Thread is running");
	else System.out.println("Thread is dead");
}
	
private static void simpleConstantsExample(int i) {
	if(i == ThreadStatesConstant.START) System.out.println("Thread started");
	else if (i == ThreadStatesConstant.WAITING) System.out.println("Thread is waiting");
	else if (i == ThreadStatesConstant.RUNNING) System.out.println("Thread is running");
	else System.out.println("Thread is dead");
}


}
