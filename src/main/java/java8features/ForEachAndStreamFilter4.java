package java8features;

import java.util.ArrayList;
import java.util.List;

/*Refer: https://beginnersbook.com/2017/10/java-8-features-with-examples/ */
public class ForEachAndStreamFilter4 {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("Maggie");
      names.add("Michonne");
      names.add("Rick");
      names.add("Merle");
      names.add("Governor");
      names.stream() //creating stream 
     .filter(f->f.startsWith("M")) //filtering names that starts with M 
     //.forEach(System.out::println); //displaying the stream using #Method Reference#
     
     .forEach(f-> System.out.println(f)); //displaying the stream using #Lambda Expression#
   }
}