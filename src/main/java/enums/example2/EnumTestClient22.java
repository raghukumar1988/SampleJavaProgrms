package enums.example2;

public class EnumTestClient22 {
    public static void main(String[] args) {
        Pizza2 pizza2 = new Pizza2();
        System.out.println(pizza2.isPizzaDeliverable()); // false
        pizza2.setPizzaStatus(PizzaStatus21.READY);
        System.out.println(pizza2.isPizzaDeliverable()); // true

        //******************************************************************************************
        //Comparing Enum Types Using “==” Operator

        /* Since enum types ensure that only one instance of the constants exist in the JVM,
         we can safely use the “==” operator to compare two variables,like we did in the above example.
          Furthermore, the “==” operator provides compile-time and run-time safety. */

        /*First, we'll look at RUN-TIME TYPESafety in the following snippet,
         where we'll use the “==” operator to compare statuses.
         Even though the value is null, we won't get a NullPointerException.
         Conversely, if we use the equals method, we will get a NullPointerException.*/
        pizza2.setPizzaStatus(null);
        //System.out.println(pizza2.getPizzaStatus().equals(PizzaStatus21.DELIVERED));
        System.out.println(pizza2.getPizzaStatus()==(PizzaStatus21.DELIVERED));

        /*As for compile-time safety, let's look at an example where we'll determine that
        an enum of a different type is equal by comparing it using the equals method.
        This is because the values of the enum and the getStatus method coincidentally are the same;
        however, logically the comparison should be false.
        We avoid this issue by using the “==” operator.
        The compiler will flag the comparison as an incompatibility error:*/

        //System.out.println(pizza2.getPizzaStatus().equals(TriColours.GREEN));// Run time Exception
        //System.out.println(pizza2.getPizzaStatus() == (TriColours.GREEN)); // Compile time Exception

        //******************************************************************************************
        //Using Enum Types in Switch Statements
        pizza2.setPizzaStatus(PizzaStatus21.OUT_FOR_DELIVERY);
        System.out.println(pizza2.getDeliveryTimeInDays());


    }

}
