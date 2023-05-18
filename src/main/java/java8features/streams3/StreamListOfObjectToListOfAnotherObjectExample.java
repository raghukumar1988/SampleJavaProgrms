package java8features.streams3;

import java8features.streams3.model.ExportProduct;
import java8features.streams3.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListOfObjectToListOfAnotherObjectExample {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product(1, "Shampoo", 70)
                , new Product(2, "Soap", 20)
                , new Product(3, "HairOil", 50));

        List<ExportProduct> exportProducts = products.stream().map(product -> {
            ExportProduct exportProduct = new ExportProduct();
            exportProduct.setId(product.getId());
            exportProduct.setPrice(product.getPrice());
            exportProduct.setName(product.getName());
            if (product.getName().equals("Soap")) {
                exportProduct.setRemarks("Check the TFM level");
            }
            return exportProduct;
        }).collect(Collectors.toList());

        exportProducts.forEach(System.out::println);
    }

}
