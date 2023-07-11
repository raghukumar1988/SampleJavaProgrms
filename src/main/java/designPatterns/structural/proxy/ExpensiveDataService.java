package designPatterns.structural.proxy;

public class ExpensiveDataService implements DataService {
    public ExpensiveDataService() {
        // Perform resource-intensive initialization
    }

    @Override
    public void fetchData() {
        // Perform expensive database operations
        System.out.println("Fetching data from the database...");
    }
}
