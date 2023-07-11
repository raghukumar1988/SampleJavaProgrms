package designPatterns.structural.proxy;

public class DataServiceProxy implements DataService {
    private DataService service;

    public DataServiceProxy() {
        // The actual service object is created on-demand
    }

    @Override
    public void fetchData() {
        if (service == null) {
            service = new ExpensiveDataService();
        }

        // Additional functionality can be added before or after delegating to the actual service
        System.out.println("Proxy: Before fetching data...");

        // Delegate the operation to the actual service
        service.fetchData();

        // Additional functionality can be added after the operation
        System.out.println("Proxy: After fetching data...");
    }
}
