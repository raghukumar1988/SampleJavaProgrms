package java8features.optional22.nullcheckExample.java8Way;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Mobile {

    private long id;
    private String brand;
    private String name;
    private Optional<DisplayFeatures> displayFeatures;
    // Likewise we can have Memory Features, Camera Features etc.


}