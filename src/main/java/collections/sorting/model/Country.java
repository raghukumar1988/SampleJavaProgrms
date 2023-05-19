package collections.sorting.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    private int countryId;
    private String countryName;

    @Override
    public String toString() {
        return this.countryId + " " + this.countryName;
    }

}
