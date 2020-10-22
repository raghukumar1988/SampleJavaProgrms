package string;
import java.util.Scanner;

public class RemoveWhiteSpaces 
{
	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input string to be cleaned from white spaces...!");
		
		String inputString = sc.nextLine();
		
		char[] charArray = inputString.toCharArray();
		
		String stringWithoutSpaces = "";
		
		for (int i = 0; i < charArray.length; i++) 
		{
			if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
			{
				stringWithoutSpaces = stringWithoutSpaces + charArray[i];
			}
		}
		
		System.out.println("Input String : "+inputString);
		
		System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
		
		sc.close();*/
		
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Please enter the string to remove spaces");
		String inputString=scanner.nextLine();
		String stringwoSpaces="";
		char[] charArray=inputString.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!=' ') {
				stringwoSpaces+=charArray[i];
			}
		}
		System.out.println("final String"+ stringwoSpaces);
		
		
		scanner.close();
	}
}