package enums.example3;

public class EnumTestClient3 {
    public static void main(String[] args) {
        Pizza3 testPz = new Pizza3();
        testPz.setStatus(PizzaStatus3.READY);
        System.out.println(testPz.isDeliverable());// true
    }
}
