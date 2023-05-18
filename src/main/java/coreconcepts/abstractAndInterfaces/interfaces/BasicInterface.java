package coreconcepts.abstractAndInterfaces.interfaces;

interface Animal {
    void getLivingSpace();

    void getColor();

    void isHumanFriendly();

    void getSize();
}

abstract class WildAnimal implements Animal {
    @Override
    public void getColor() {
        System.out.println("Inside Wild Animal");
    }
}

class DomesticAnimal extends WildAnimal {
    @Override
    public void getLivingSpace() {
        System.out.println("Inside Domestic Animal");
    }

    /*@Override
    public void getColor() {
        System.out.println("Inside Domestic Animal");
    }*/

    @Override
    public void getSize() {
        System.out.println("Inside Domestic Animal");
    }

    @Override
    public void isHumanFriendly() {
        System.out.println("Inside Domestic Animal");
    }
}

class BasicInterface {
    public static void main(String[] args) {
        Animal a = new DomesticAnimal();
        a.getLivingSpace();
        a.getColor();
        a.isHumanFriendly();
        a.getSize();
    }
}
