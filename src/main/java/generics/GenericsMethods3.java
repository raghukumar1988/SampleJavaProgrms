package generics;

public class GenericsMethods3 {

	//Java Generic Method
	public static <T> boolean isEqual(GenericsType2<T> g1, GenericsType2<T> g2){
		return g1.get().equals(g2.get());
	}
	
	public static void main(String args[]){
		GenericsType2<String> g1 = new GenericsType2<>();
		g1.set("Raghu");
		
		GenericsType2<String> g2 = new GenericsType2<>();
		g2.set("Kumar");
		
		boolean isEqual = GenericsMethods3.<String>isEqual(g1, g2);
		//above statement can be written simply as
		isEqual = GenericsMethods3.isEqual(g1, g2);

	}
	/*	This feature, known as type inference, allows you to invoke a generic method as an ordinary method,
		 without specifying a type between angle brackets.
		//Compiler will infer the type that is needed*/
}
