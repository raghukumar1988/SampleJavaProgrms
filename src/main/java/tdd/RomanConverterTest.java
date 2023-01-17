package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanConverterTest {

@Test
void convertI(){
    assertEquals(1, new RomanConverter().convertRomanToArabicNumber("I"));
}

@Test
    void convertII(){
    assertEquals(2, new RomanConverter().convertRomanToArabicNumber("II"));
}
@Test
    void convertIII(){
    assertEquals(3, new RomanConverter().convertRomanToArabicNumber("III"));
}
}