package com.shanek.isbntools;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExampleTests {

    @Test
    public void checkValidISBN() {
        //        fail("testing failure");
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN(0306406152);
        assertTrue(result);
    }

    @Test
    public void checkInvalidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN(0306406155);
        assertFalse(result);
    }
}
