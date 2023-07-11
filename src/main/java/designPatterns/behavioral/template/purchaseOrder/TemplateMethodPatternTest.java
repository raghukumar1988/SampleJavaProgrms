package designPatterns.behavioral.template.purchaseOrder;

public class TemplateMethodPatternTest {

      public static void main(String[] args) {
         PurchaseOrderTemplate online= new OnlinePurchaseOrder();
         //online.isGift=true;
         online.processOrder();
          System.out.println("#######################");
         PurchaseOrderTemplate offline= new StorePurchaseOrder();
         offline.processOrder();
      }
}