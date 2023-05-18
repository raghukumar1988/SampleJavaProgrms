package coreconcepts.enums.example3;

public class Pizza3 {
    private PizzaStatus3 status;

    public PizzaStatus3 getStatus() { // getter
        return status;
    }

    public void setStatus(PizzaStatus3 status) { //setter
        this.status = status;
    }

    public boolean isDeliverable() {
        return this.status.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.getStatus().getTimeToDelivery());
    }
}
