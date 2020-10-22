package string;
class StringBufferEqualsDemo{
 
public static void main(String [] args){ 
 
StringBuffer fstr= new StringBuffer("Javatutorials");
StringBuffer sstr= new StringBuffer("Javatutorials"); 
 
System.out.println(fstr.equals(sstr));
System.out.println(fstr==sstr);
 
System.out.println(fstr.hashCode());
System.out.println(sstr.hashCode());
}
}