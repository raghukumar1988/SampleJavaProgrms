package AbstractAndInterfaces.abstraction;

abstract class AbstractMessagePrinter {
    abstract void printInfo();

    void printMsg(){
        System.out.println("Inside printMsg..");
    }

    public static void main(String[] args) {
        System.out.println("Inside Main Method.. "); // we can run an Abstract class if it has main method
        AbstractMessagePrinter abstractMessagePrinter1 = new AbstractMessagePrinter() { //anonymous implementation
            @Override
            void printInfo() {
                System.out.println("Inside printInfo..");
            }
        };
        abstractMessagePrinter1.printInfo();
        abstractMessagePrinter1.printMsg();
    }
}
 

