package test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FIExample {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Boolean> isSumEven= (num1,num2) -> {
            if((num1+num2)%2==0){
                return true;
            }
            return false;
        };

        System.out.println(isSumEven.apply(23,34));
        System.out.println(isSumEven.apply(23,23));

    }


}

