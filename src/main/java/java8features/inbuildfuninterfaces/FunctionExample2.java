package java8features.inbuildfuninterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Function;

public class FunctionExample2 {
//The function interface contains exactly one abstract method apply(T t).
    // Method Signature - R apply(T t);
    // it takes an argument and returns a value
    public static void main(String[] args) {
        // convert centigrade to fahrenheit
        Function < Integer, Double > centigradeToFahrenheitInt = x -> Double.valueOf((x * 9 / 5) + 32);
        System.out.println(" Centigrade to Fahrenheit: " + centigradeToFahrenheitInt.apply(6));

        // String to an integer
        Function < String, Integer > stringToInt = x -> Integer.valueOf(x);
        System.out.println(" String to Int: " + stringToInt.apply("4"));

        // Entity to DTO
        Function < PersonEntity, PersonDTO > function = (entity) -> {
            return new PersonDTO(entity.getName(), entity.getAge());
        };
        PersonDTO personDTO = function.apply(new PersonEntity("ramesh", 20));
        System.out.println(personDTO.getName());
        System.out.println(personDTO.getAge());
    }
}

@Data
@AllArgsConstructor
class PersonEntity {
    private String name;
    private int age;
}

@Data
@AllArgsConstructor
class PersonDTO {
    private String name;
    private int age;

}