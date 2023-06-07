package java8features.optional2.nullcheckExample.java8Way;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class DisplayFeatures {

    private String size;
    private Optional<ScreenResolution> resolution;


}