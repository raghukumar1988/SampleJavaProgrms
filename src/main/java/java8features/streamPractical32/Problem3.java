package java8features.streamPractical32;

import java8features.streamPractical32.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        //Obtain a list of product with category = “Toys” and then apply 10% discount

        List<Product> result = new ArrayList<>();
        List<Double> toys = result.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                .map(p -> p.getPrice() * 0.9)
                .collect(Collectors.toList());
        System.out.println(toys);
    }
}
