package designPatterns.abstractfactory;

public class ColourFactory implements AbstractFactory<Colour>{

    @Override
    public Colour getInstance(String name) {
        if(name.equals("Red")){
            return new Red();
        }else if(name.equals("Yellow")){
            return new Yellow();
        }
        return null;
    }
}
