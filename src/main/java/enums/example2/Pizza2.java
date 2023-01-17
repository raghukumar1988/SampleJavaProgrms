package enums.example2;

public class Pizza2 {
    private PizzaStatus21 pizzaStatus;

    //getter
    public PizzaStatus21 getPizzaStatus() {
        return pizzaStatus;
    }

    //setter
    public void setPizzaStatus(PizzaStatus21 pizzaStatus) {
        this.pizzaStatus = pizzaStatus;
    }

    //custom method
    public  boolean isPizzaDeliverable(){
        return getPizzaStatus() == PizzaStatus21.READY; //Simple form of below
        /* if(getPizzaStatus() == PizzaStatus21.READY){
            return true;
        }
        return false; */
    }

    //Using Enum Types in Switch Statements
    public int getDeliveryTimeInDays() {
        switch (pizzaStatus) {
            case ORDERED: return 5;
            case READY: return 2;
            case OUT_FOR_DELIVERY: return 1;
            case DELIVERED: return 0;
        }
        return 0;
    }

}
