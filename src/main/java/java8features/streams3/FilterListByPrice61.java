package java8features.streams3;


import java8features.streams3.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterListByPrice61 {
    public static void main(String[] args) {

        List<Product> productsList = getStubbedProductList();

        filterProductByPriceAndIterate(productsList);
        filterProductByIdAndPrint(productsList);
        filterProductByPriceAndCovertAsSet(productsList);
        filterProductAndMapByIdConvertAsList(productsList);// returns List<Integer>
        filterByIdMapByMethodAndCollectAsList(productsList); // returns List<Product>
        filterByIdMapByIntMapConvertToList(productsList);
        boxingExample();
    }

    private static void boxingExample() {
        Stream<String> stringStream = Stream.of("12", "13", "14", "15");
        List<Integer> integerList = stringStream.mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        integerList.forEach(System.out::println);
        System.out.println("Printing List with integers..");
    }

    private static void filterByIdMapByIntMapConvertToList(List<Product> productsList) {
        /* Collections in Java can not store the primitive values directly instead they can store only instances/objects.
        Using boxed() method of IntStream, we can get a stream of wrapper objects which can be collected by Collectors methods. */
        List<Integer> idList = productsList.stream()
                // if I enable below, I need to use boxed() ; Because I need to convert IntStream to Stream<Integer>
                //.mapToInt(product -> product.getId())
                .map(Product::getId)
                .filter(id -> id > 3)
                //.boxed() // concentrate here -  Refer - https://howtodoinjava.com/java8/java8-boxed-intstream/
                .collect(Collectors.toList());
        System.out.println(idList);
        System.out.println("################################################");
    }

    // Practical DTO mapping example
    private static void filterByIdMapByMethodAndCollectAsList(List<Product> productsList) {
        List<Product> modifiedProductList = productsList.stream()
                .filter(product -> product.getId() < 3)
                .map(FilterListByPrice61::modifyProductDetails)
                //.map(product -> modifyProduct(product))
                .collect(Collectors.toList());

        System.out.println(modifiedProductList);
        System.out.println("################################################");
    }

    private static Product modifyProductDetails(Product product) { // Utility method
        Product modifiedProduct = new Product();
        modifiedProduct.setId(product.getId() * 2); // multiplying 2
        modifiedProduct.setName(product.getName() + 2); // appending 2
        modifiedProduct.setPrice(product.getPrice() * 2f);
        return modifiedProduct;
    }

    private static void filterProductAndMapByIdConvertAsList(List<Product> productsList) {
        // map method is used to transform each element of collection
        // note below list Type
        List<Integer> idDoubledList = productsList.stream() // Returns Stream<Product>
                .filter(product -> product.getId() < 3) // Returns Stream<Product>
                .map(product -> product.getId() * 2) // Returns Stream<Integer>
                .collect(Collectors.toList());
        System.out.println(idDoubledList);
        System.out.println("################################################");
    }

    private static void filterProductByPriceAndCovertAsSet(List<Product> productsList) {
        Set<Product> productsSet = productsList.stream()
                .filter(product -> product.getPrice() > 28000f)
                .collect(Collectors.toSet());
        System.out.println("Printing Product Set --> " + productsSet);
        System.out.println("################################################");
    }

    private static void filterProductByIdAndPrint(List<Product> productsList) {
        List<Product> top2Products = productsList.stream()
                .filter(product -> product.getId() < 3)
                .collect(Collectors.toList());
        System.out.println(top2Products);
        System.out.println("################################################");
    }

    private static void filterProductByPriceAndIterate(List<Product> productsList) {
        productsList.stream()
                .filter(product -> product.getPrice() == 30000)
                .forEach(product -> System.out.println(product.getPrice()));
                //.forEach(product -> System.out.println(product)); // another way of below
                //.forEach(System.out::println);

        System.out.println("################################################");
    }

    private static List<Product> getStubbedProductList() { // Utility method
        List<Product> productsList = new ArrayList<Product>();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        return productsList;
    }


}
