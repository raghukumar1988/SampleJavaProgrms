package java8features.optional22.nullcheckExample.olderWay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Mobile {

    private long id;
    private String brand;
    private String name;
    private DisplayFeatures displayFeatures;
    // Likewise we can have Memory Features, Camera Features etc.


}