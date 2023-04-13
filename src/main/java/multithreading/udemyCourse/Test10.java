package multithreading.udemyCourse;

import java.util.concurrent.*;

class GetStockQuoteTask implements Callable<Double> {
    private String stockSymbol;

    public GetStockQuoteTask(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public Double call() {
        // Write some logic to fetch the stock price for the given symbol and return it.
        return 0.0;
    }
}

public class Test10 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        String symbol = "ABCD";
        GetStockQuoteTask task = new GetStockQuoteTask(symbol);
        Future<Double> future = executor.submit(task);
        Double price = future.get();
        System.out.println(price);
    }
}