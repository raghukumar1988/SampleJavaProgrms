package string;

import java.util.Hashtable;

class StringDemo{
 
public static void main(String [] args){ 
 
String fstr= new String("Javatutorials");
String sstr= new String("Javatutorials"); 
 
 Hashtable<String, String> ht=new Hashtable<String, String>();
 //HashMap<String, String> ht=new HashMap<String, String>();
 
        ht.put(fstr, "abc");
        ht.put(sstr, "xyz");
        
        System.out.println(ht);
}
}