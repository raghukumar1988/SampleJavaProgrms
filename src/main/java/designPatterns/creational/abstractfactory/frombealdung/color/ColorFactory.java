package designPatterns.creational.abstractfactory.frombealdung.color;

import designPatterns.creational.abstractfactory.frombealdung.AbstractFactory;
import designPatterns.creational.abstractfactory.frombealdung.color.Brown;
import designPatterns.creational.abstractfactory.frombealdung.color.Color;
import designPatterns.creational.abstractfactory.frombealdung.color.White;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color createInstance(String colorType) {
        if ("Brown".equalsIgnoreCase(colorType)) {
            return new Brown();
        } else if ("White".equalsIgnoreCase(colorType)) {
            return new White();
        }

        return null;
    }

}
