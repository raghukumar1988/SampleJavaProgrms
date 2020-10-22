import java.util.Arrays;

class EqualityOfTwoArrays
{
	public static void main(String[] args)
	{
		String[] s1 = {"java", "struts","j2ee", "hibernate"};
		String[] s3 = {"java", "struts", "j2ee", "hibernate"};

		System.out.println(Arrays.equals(s1, s3));      
	}
}