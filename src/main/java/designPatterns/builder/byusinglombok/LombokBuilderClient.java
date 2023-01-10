package designPatterns.builder.byusinglombok;

public class LombokBuilderClient {
    public static void main(String[] args) {
        Employee employee= Employee.builder()
                .firstName("Raghu")
                //.lastName("Rajamani")
                .build();

        System.out.println(employee);
/*In complete - refer https://howtodoinjava.com/lombok/lombok-builder-annotation/*/
    }
}
