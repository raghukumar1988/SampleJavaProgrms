package designPatterns.creational.singleton;

/* This implementation fixes multithread issue however not handled the memory effectively  because of
eager instance creation */
public class EagerSingleton2 {

    private static EagerSingleton2 instance = new EagerSingleton2();

    private EagerSingleton2() {
    }

    public static EagerSingleton2 getInstance() {
        return instance;
    }
}
