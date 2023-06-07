package coreconcepts.generics;

public class GenericsMethods3 {
	/*  Sometimes we don’t want the whole class to be parameterized, in that case, we can create java generics method.
	Since the constructor is a special kind of method, we can use generics type in constructors too.  */

	//Java Generic Method 1
	public static <T> boolean isEqual(GenericsType2<T> g1, GenericsType2<T> g2){
		return g1.get().equals(g2.get());
	}

	//public static <T> boolean areNumbersEqual(T t1, T t2){ // Uncomment and see
	public static <T extends Number> boolean areNumbersEqual(T t1, T t2){ // bounded types
		return t1.equals(t2);
	}
	
	public static void main(String[] args){
		GenericsType2<String> g1 = new GenericsType2<>();
		g1.set("Raghu");
		
		GenericsType2<String> g2 = new GenericsType2<>();
		g2.set("Kumar");
		System.out.println(GenericsMethods3.isEqual(g1,g2));

		//System.out.println(areNumbersEqual(12,"Raghu")); // Unbounded Generics
		System.out.println(areNumbersEqual(12,24)); // Bounded Generics
	}

}
