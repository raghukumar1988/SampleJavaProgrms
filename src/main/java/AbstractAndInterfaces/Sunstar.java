package AbstractAndInterfaces;

abstract class Sunstar {
    abstract void printInfo();

    void printMsg(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Hello"); // we can run a Abstract class if it has main method
        /*Sunstar sunstar1= new Sunstar() {
            @Override
            void printInfo() {
                System.out.println("Test");
            }
        };
        sunstar1.printInfo();*/
    }
}
 

