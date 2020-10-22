package string;

import java.util.HashMap;

class StringBufferHashtableDemo{
 
public static void main(String [] args){ 
 
StringBuffer fstr= new StringBuffer("Javatutorials");
StringBuffer sstr= new StringBuffer("Javatutorials"); 
 
// Hashtable<StringBuffer, String> ht=new Hashtable<StringBuffer, String>();
HashMap<StringBuffer, String> ht=new HashMap<StringBuffer, String>();
 
        ht.put(fstr, "abc");
        ht.put(sstr, "xyz");
        
        System.out.println(ht);
}
}