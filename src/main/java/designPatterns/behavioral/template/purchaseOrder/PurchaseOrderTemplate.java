package designPatterns.behavioral.template.purchaseOrder;

public abstract class PurchaseOrderTemplate {

    public boolean isGift; // boolean variable

    public abstract void doSelect();

    public abstract void doPayment();

    public final void doPack() {
        System.out.println("Gift wrap done.");
    }

    public abstract void doDelivery();

    public final void processOrder() {
        doSelect();
        doPayment();
        /*if (isGift) {
            doPack();
        }*/
        doPack();
        doDelivery();
    }
}