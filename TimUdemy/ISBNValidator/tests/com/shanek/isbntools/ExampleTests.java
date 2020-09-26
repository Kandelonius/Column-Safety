package com.shanek.isbntools;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExampleTests {

    @Test
    public void checkValid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0306406152");
        assertTrue("first value", result);
        result = validator.checkISBN("0201633612");
        assertTrue("second value", result);
    }

    @Test
    public void checkValid10DigitISBNWithX() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("159327890X");
        assertTrue(result);
    }

    @Test
    public void ISBNCanHave13Digits() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9780262510875");
        assertTrue("first value", result);
        result = validator.checkISBN("9780195004120");
        assertTrue("second value", result);
    }

    @Test
    public void checkInvalid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0306406155");
        assertFalse(result);
    }

    @Test
    public void checkInvalid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9780195004121");
        assertFalse(result);
    }

    @Test(expected = NumberFormatException.class)
    public void nineDigitISBNsAreNotAllowed() {
        ValidateISBN validator = new ValidateISBN();
        validator.checkISBN("123456789");
    }

    @Test(expected = NumberFormatException.class)
    public void ISBNMustBeANumber() {
        ValidateISBN validator = new ValidateISBN();
        validator.checkISBN("helloworld");
    }

}
