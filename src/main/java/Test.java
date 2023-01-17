import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test
{
	public static void main(String[] args){
		String fstr= new String("Javatutorials");

		String sstr= new String("Javatutorials");

		String ssstr= new String("Javatutorials");

		Hashtable ht=new Hashtable();

		ht.put(fstr, "abc");

		ht.put(sstr, "xyz");
		ht.put(ssstr, "frt");
		System.out.println(fstr.hashCode());
		System.out.println(sstr.hashCode());
		System.out.println(ssstr.hashCode());

		System.out.println(ht);
	}
}