package abstractAndInterfaces.abstraction;

abstract class AbstractAnonymousImplExample1 {
    abstract void printInfo();

    void printMsg(){
        System.out.println("Inside printMsg..");
    }

    public static void main(String[] args) {
        System.out.println("Inside Main Method.. "); // we can run an Abstract class if it has main method
        AbstractAnonymousImplExample1 abstractAnonymous = new AbstractAnonymousImplExample1() { //anonymous implementation
            @Override
            void printInfo() {
                System.out.println("Inside printInfo..");
            }
        };
        abstractAnonymous.printInfo();
        abstractAnonymous.printMsg();
    }
}
 

