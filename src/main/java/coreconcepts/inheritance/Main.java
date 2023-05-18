package coreconcepts.inheritance;

class Main extends Parent {
    public static void main(String[] args) {
        Main in = new Main();
        ;
        in.method();  //this won't call SuperParent method
    }
}