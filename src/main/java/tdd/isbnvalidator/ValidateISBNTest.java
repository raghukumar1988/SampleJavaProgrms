package tdd.isbnvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateISBNTest {

    @Test
    public void checkValid10DigitISBN(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0306406152");
        assertTrue(result,"first value");
        result= validator.checkISBN("0764526413");
        assertTrue(result,"Second value");
    }

    @Test
    void checkValidISBNWith13digits(){
        ValidateISBN validateISBN= new ValidateISBN();
        boolean result= validateISBN.checkISBN("9789295055025");
        assertTrue(result);
    }

    @Test
    void checkInvalidISBNWith13Digits(){
        ValidateISBN validateISBN= new ValidateISBN();
        boolean result= validateISBN.checkISBN("9783161484101");
        assertFalse(result);
    }

    @Test
    void TenDigitISBNNumberEndingWithXAreValid(){
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    void checkInvalid10DigitISBN(){
       ValidateISBN validateISBN= new ValidateISBN();
       boolean result= validateISBN.checkISBN("0354354364");
       assertFalse(result);
    }

    @Test
    void nineDigitISBNAreNotNine(){
        ValidateISBN validateISBN= new ValidateISBN();
        assertThrows(NumberFormatException.class,()->validateISBN.checkISBN("354354364"));
    }

    @Test
    void alphabetsAreNotAllowedInISBN(){
        ValidateISBN validateISBN= new ValidateISBN();
        assertThrows(NumberFormatException.class,()->validateISBN.checkISBN("helloworld"));
    }



}
