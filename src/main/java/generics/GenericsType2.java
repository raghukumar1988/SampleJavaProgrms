package generics;

public class GenericsType2<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	//@SuppressWarnings("rawtypes")
	public static void main(String args[]){
		GenericsType2<String> type = new GenericsType2<>();
		type.set("Pankaj"); //valid
		System.out.println(type.get());
		
		GenericsType2 type1 = new GenericsType2(); //raw type
		type1.set("Pankaj"); //valid
		type1.set(10); //valid and autoboxing support
		System.out.println(type1.get());
	}
}
/*Reference: https://www.journaldev.com/1663/java-generics-example-method-class-interface#java-generic-type*/
