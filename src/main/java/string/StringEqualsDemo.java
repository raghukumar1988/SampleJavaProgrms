package string;
class StringEqualsDemo{
 
public static void main(String [] args){ 
 
String fstr= new String("Javatutorials");
String sstr= new String("Javatutorials"); 
 
System.out.println(fstr.equals(sstr));
System.out.println(fstr==sstr);
 
System.out.println(fstr.hashCode());
System.out.println(sstr.hashCode());
}
}