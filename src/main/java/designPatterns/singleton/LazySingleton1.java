package designPatterns.singleton;
/*This implementation is not thread safe*/
public class LazySingleton1 {

    private static LazySingleton1 instance = null;

    private LazySingleton1() {
    }

    public static LazySingleton1 getInstance() {
        if (null == instance) {
            instance = new LazySingleton1();
        }
        return instance;
    }

}
