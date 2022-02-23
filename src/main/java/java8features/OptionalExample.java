package java8features;

import lombok.Data;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] a) {
        User user = new User();
        Optional<Address> optAddress= user.getAddress();
        if(optAddress.isPresent()){
            Address address = optAddress.get();
            System.out.println(address.getAddressLine1());
            System.out.println(address.getAddressLine2());
        }
        //System.out.println(user.getAddress().getAddressLine1());


    }

    @Data
    static class User {

        private String name;
        private int empId;
        private Address address;

        public Optional<Address> getAddress() {
            address= new Address();
            address.setAddressLine1("Address line1");
            return Optional.ofNullable(address);
        }
    }

    @Data
    static class Address {
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;


    }
}


