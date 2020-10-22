public class Test
{
	public static void main(String[] args)
	{
		System.out.println(findNumber(145,4));
	}

	private static int findNumber(int number, int digit) {
		char chardigit=Integer.toString(digit).charAt(0);
		for(int i=number;i>0;--i) {
			if(Integer.toString(i).indexOf(chardigit)==-1) {
				return i;
			}
		}
		return -1;
	}
}