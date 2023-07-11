package java8features.streamPractical32;

import java8features.streamPractical32.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*Refer here - https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82*/
public class Problem1 {
    public static void main(String[] args) {

        // Obtain a list of products belongs to category “Books” with price > 100
        List<Product> stubbedProductList = getStubbedProductList();
        List<Product> collectedProducts = stubbedProductList.stream()
                //.filter(product -> product.getCategory().equalsIgnoreCase("books"))
                //.filter(product -> product.getPrice()>100)
                .filter(Problem1::checkForMatchingProducts)
                .collect(Collectors.toList());
        System.out.println(collectedProducts);
        System.out.println();

        //Obtain a list of order with products belong to category “Baby”
    }

    private static boolean checkForMatchingProducts(Product product) {
        return (product.getCategory().equalsIgnoreCase("books") && product.getPrice()>100);

    }

    private static List<Product> getStubbedProductList() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(242523L, "Book A", "books", 234.89));
        productList.add(new Product(236523L, "Book C", "books", 12.89));
        productList.add(new Product(242523L, "Pen", "Others", 12.30));
        productList.add(new Product(242523L, "Pencil", "Others", 13.40));
        productList.add(new Product(242523L, "Book B ", "books", 134.23));
        return productList;

    }
}
