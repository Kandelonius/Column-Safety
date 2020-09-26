package com.shanek.isbntools;

public class ValidateISBN {

    public static final int longISBN = 13;

    public static final int shortISBN = 10;

    public static final int SHORT_ISBN_MULTIPLIER = 11;

    public static final int LONG_ISBN_MULTIPLIER = 10;

    public static void main(String[] args) {
        System.out.println("hello world!");
    }

    public boolean checkISBN(String isbn) {
        int total = 0;
        if (isbn.length() == longISBN) {
            return isThisAValidLongISBN(isbn,
                total);
        } else if (isbn.length() == shortISBN) {
            return isThisAValidShortISBN(isbn,
                total);
        }
        throw new NumberFormatException("ISBNs must be 10 or 13 digits long.");
    }

    private boolean isThisAValidShortISBN(
        String isbn,
        int total) {
        for (int i = 0; i < shortISBN; i++) {
            if (Character.isDigit(isbn.charAt(i))) { // checking the digit is numeric
                total += Character.getNumericValue(isbn.charAt(i)) * (10 - i); // taking a tally
            } else { // letter x is ok for the final number
                if (Character.toLowerCase(isbn.charAt(i)) == 'x' && i == 9) {
                    total += 10;
                } else {
                    throw new NumberFormatException("ISBN not numeric.");
                }
            }
        }
        return total % SHORT_ISBN_MULTIPLIER == 0;
    }

    private boolean isThisAValidLongISBN(
        String isbn,
        int total) {
        for (int i = 0; i < longISBN; i++) {
            if (Character.isDigit(isbn.charAt(i)) && i % 2 == 1) {
                total += Character.getNumericValue(isbn.charAt(i)) * 3;
            } else if (Character.isDigit(isbn.charAt(i)) && i % 2 == 0) {
                total += Character.getNumericValue(isbn.charAt(i));
            }
        }
        return total % LONG_ISBN_MULTIPLIER == 0;
    }
}
