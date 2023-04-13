package basicPrograms.string.stringvsbuffervsbuilder;
class StringBuilderEqualsDemo{
 
public static void main(String [] args){ 
 
StringBuilder fstr= new StringBuilder("Javatutorials");
StringBuilder sstr= new StringBuilder("Javatutorials"); 
 
System.out.println(fstr.equals(sstr));
System.out.println(fstr==sstr);
 
System.out.println(fstr.hashCode());
System.out.println(sstr.hashCode());
}
}