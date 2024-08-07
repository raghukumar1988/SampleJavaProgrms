package java8features.optional22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptionalExample32Test {


    @Test
    public void whenNameIsNull_thenExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class, ()-> OptionalExample32.orElseThrowWithCustomEExceptionOptionalAPI(null));
        assertAll(()-> OptionalExample32.orElseThrowWithCustomEExceptionOptionalAPI("Raghu"));
        assertDoesNotThrow( ()-> OptionalExample32.orElseThrowWithCustomEExceptionOptionalAPI("Raghu"));
    }
}