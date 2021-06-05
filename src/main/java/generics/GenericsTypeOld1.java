package generics;

public class GenericsTypeOld1 {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

        public static void main(String args[]){
		GenericsTypeOld1 type = new GenericsTypeOld1();
		type.set("Raghu");
			//Integer number = (Integer) type.get(); //type casting, error prone and can cause ClassCastException in Runtime
 			String str = (String) type.get();
			System.out.println(str);
	}
}