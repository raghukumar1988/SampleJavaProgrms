package java8features.streamPractical32.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> productList;
    private Customer customer;

}
