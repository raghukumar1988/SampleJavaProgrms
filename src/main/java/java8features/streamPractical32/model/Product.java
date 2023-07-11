package java8features.streamPractical32.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;
}
