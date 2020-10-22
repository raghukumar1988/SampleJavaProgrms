package static_must;

public class Example2 {
	float x;
	Rectangle r1 = new Rectangle();
	/* static float x;*/
	

	public static void main(String[] args) {
		Example2 ex2 = new Example2();
		ex2.x = ex2.r1.calculateAreaOfRectangle(10, 5);   //non static methods and variables 
		                                                  // need to be  accessed using . operator
		System.out.println(ex2.x);
/*		 Rectangle rt=new Rectangle();
		 x=rt.calculateAreaOfRectangle(10, 5);
		 System.out.println(x);*/
	}

}