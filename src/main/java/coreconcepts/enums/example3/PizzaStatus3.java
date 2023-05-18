package coreconcepts.enums.example3;
// more details in https://www.baeldung.com/a-guide-to-java-enums
public enum PizzaStatus3 {

    //Fields, Methods and Constructors in Enums
    /* We can define coreconcepts.constructors, methods, and fields inside enum types, which makes them very powerful.
      Next, let's extend the example above by implementing the transition from one stage of a pizza order to another.
      We'll see how we can get rid of the if and switch statements used before:*/

    ORDERED (5){
        @Override
        public boolean isOrdered() {
            return true;
        }
    },
    READY (2){
        @Override
        public boolean isReady() {
            return true;
        }
    },
    DELIVERED (0){
        @Override
        public boolean isDelivered() {
            return true;
        }
    },
    OUT_FOR_DELIVERY(1){
        @Override
        public boolean isOutForDelivery(){
            return true;
        }
    };

    private int timeToDelivery;

    public boolean isOrdered() {return false;}

    public boolean isReady() {return false;}

    public boolean isDelivered(){return false;}

    public boolean isOutForDelivery(){return false;}

    public int getTimeToDelivery() {
        return timeToDelivery;
    }

    PizzaStatus3 (int timeToDelivery) {
        this.timeToDelivery = timeToDelivery;
    }
}
