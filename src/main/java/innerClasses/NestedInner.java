package innerClasses;

class Outer1 {
    void method() {
	System.out.println("I am here");

}
   class Inner {
      public void show() {
           System.out.println("In a nested class method");
      }
   }
}

class NestedInner {
   public static void main(String[] args) {
       Outer1.Inner in = new Outer1().new Inner();
       in.show();
       Outer1 out= new Outer1();
       out.method();
   }
}