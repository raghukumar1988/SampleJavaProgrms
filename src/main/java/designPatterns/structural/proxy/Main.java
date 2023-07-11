package designPatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        DataService service = new DataServiceProxy();
        service.fetchData();
    }
}
