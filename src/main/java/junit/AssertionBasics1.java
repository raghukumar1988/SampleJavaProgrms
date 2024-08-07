package junit;

import java.lang.IllegalArgumentException;

import junit.utils.MathTools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionBasics1 {
    @Test
    void testConvertToDecimalSuccess() {
        double result = MathTools.convertToDecimal(3, 4);
        Assertions.assertEquals(0.75, result);
    }

    //  Add a empty test method here
    @Test
    void testConvertToDecimalInvalidDenominator() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathTools.convertToDecimal(3, 0));
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> MathTools.convertToDecimal(6, 0));
        System.out.println(exception.getMessage());
    }

    @Test
    @DisplayName("Test successful decimal conversion")
        // if the method name is not readable enough
    void testConvertToDecimalInvalidDenominator_errorCase() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathTools.convertToDecimal(3, 0), "Optional test Failure reason goes here!");
    }


}
