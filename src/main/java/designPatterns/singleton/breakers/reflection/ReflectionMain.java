package designPatterns.singleton.breakers.reflection;

import designPatterns.singleton.LazySingleton1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
     testTRefelectionBreakers();
    }

    private static void testTRefelectionBreakers() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors= LazySingleton1.class.getDeclaredConstructors();
        Constructor constructor= constructors[0];
        constructor.setAccessible(true);
        LazySingleton1 reflectInstance=(LazySingleton1) constructor.newInstance();
        LazySingleton1 instance= LazySingleton1.getInstance();

        System.out.println("instanceOne hashCode="+reflectInstance.hashCode());
        System.out.println("instanceTwo hashCode="+instance.hashCode());

        // Enum based SIngleton solves all the problems and this is highly recommended
        // This is by default ThreadSafe and Singelton.
        // The instance of ENUM is called by JVM itself so no need of private constructor.
        EnumSingleton.INSTANCE.doSomething();

    }

}
