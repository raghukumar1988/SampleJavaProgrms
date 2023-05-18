package coreconcepts.innerClasses;

 class Outer {
	void outerMethod() {
		System.out.println("inside outerMethod");
		// Inner class is local to outerMethod()
		class Inner {
			void innerMethod() {
				System.out.println("inside innerMethod");
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
}

class MethodInner {
 	//we can define the instance as static final
	private static final Outer outer_static= new Outer();
	public static void main(String[] args) {
		Outer x = new Outer();
		x.outerMethod();
	}
}


//refer https://www.geeksforgeeks.org/inner-class-java/
