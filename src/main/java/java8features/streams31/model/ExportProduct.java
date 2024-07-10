package java8features.streams31.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExportProduct {
    private int id;
    private String name;
    private float price;
    private String remarks;
}
