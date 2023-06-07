package java8features.streams3;

import java8features.streams3.model.ExportProduct;
import java8features.streams3.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamListOfObjectToListOfAnotherObjectExample53 {
    public static void main(String[] args) {
        transformObjectToAnotherTypeAndCollect();
        transformObjectToAnotherTypeAndCollectWithRefactor1();
        transformObjectToAnotherTypeAndCollectWithRefactor2(); // Recommended way
    }
    private static void transformObjectToAnotherTypeAndCollectWithRefactor2() {
        List<Product> products = Arrays.asList(new Product(1, "Shampoo", 70)
                , new Product(2, "Soap", 20)
                , new Product(3, "HairOil", 50));

        List<ExportProduct> exportProducts = products.stream()
                //.map(product -> getExportProduct(product))
                .map(StreamListOfObjectToListOfAnotherObjectExample53::getExportProduct)
                .collect(Collectors.toList());

        exportProducts.forEach(System.out::println);
        System.out.println();
    }

    private static ExportProduct getExportProduct(Product product) {  // Utility Method
        ExportProduct exportProduct = new ExportProduct();
        exportProduct.setId(product.getId());
        exportProduct.setPrice(product.getPrice());
        exportProduct.setName(product.getName());
        if (product.getName().equals("Soap")) {
            exportProduct.setRemarks("Check the TFM level");
        }
        return exportProduct;
    }

    private static void transformObjectToAnotherTypeAndCollectWithRefactor1() {
        List<Product> products = Arrays.asList(new Product(1, "Shampoo", 70)
                , new Product(2, "Soap", 20)
                , new Product(3, "HairOil", 50));

        List<ExportProduct> exportProducts = products.stream()
                .map(mapToExportProduct()).collect(Collectors.toList());

        exportProducts.forEach(System.out::println);
        System.out.println();
    }

    private static Function<Product, ExportProduct> mapToExportProduct() { // Utility Method
        return product -> {
            ExportProduct exportProduct = new ExportProduct();
            exportProduct.setId(product.getId());
            exportProduct.setPrice(product.getPrice());
            exportProduct.setName(product.getName());
            if (product.getName().equals("Soap")) {
                exportProduct.setRemarks("Check the TFM level");
            }
            return exportProduct;
        };
    }

    private static void transformObjectToAnotherTypeAndCollect() {
        List<Product> products = Arrays.asList(new Product(1, "Shampoo", 70)
                , new Product(2, "Soap", 20)
                , new Product(3, "HairOil", 50));

        List<ExportProduct> exportProducts = products.stream()
                .map(product -> {
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
        System.out.println();
    }

}
