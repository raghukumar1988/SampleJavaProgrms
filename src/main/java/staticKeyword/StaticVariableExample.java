package staticKeyword;
public class StaticVariableExample 
{
     int a =10;
     static int a_static =10;
    public static void main(String args[]){
        StaticVariableExample s1 = new StaticVariableExample();
        StaticVariableExample s2 = new StaticVariableExample();
        System.out.println("s1.a value :"+s1.a);
        System.out.println("s2.a value :"+s2.a);
        //Change s1 a value alone
        s1.a=20;
        System.out.println("s1.a value :"+s1.a);
        System.out.println("s2.a value :"+s2.a);

        System.out.println("Static value initial:"+StaticVariableExample.a_static);
         StaticVariableExample.a_static=20;
        System.out.println("Static value after :"+StaticVariableExample.a_static);
    }
}