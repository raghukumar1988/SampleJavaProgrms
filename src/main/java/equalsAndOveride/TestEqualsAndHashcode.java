package equalsAndOveride;

public class TestEqualsAndHashcode {

	public static void main(String[] args) {
		Tiger t1=  new Tiger();
		t1.setColor("Green");
		t1.setStripePattern("Black");
		
		Tiger t2=  new Tiger();
		t2.setColor("Green");
		t2.setStripePattern("Black");
/*		t2.setColor("Red");
		t2.setStripePattern("Yellow");*/
		
		System.out.println("Is both objects Equal? "+t1.equals(t2));
		System.out.println("Hashcode t1 "+t1.hashCode());
		System.out.println("Hashcode t2 "+t2.hashCode());

	}

}
