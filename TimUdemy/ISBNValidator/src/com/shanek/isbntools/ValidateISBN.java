package com.shanek.isbntools;

public class ValidateISBN {
    public static void main(String[] args) {
        System.out.println("hello world!");
    }

    public boolean checkISBN(String isbn) {
        if (isbn.length() != 10 && isbn.length() != 13) {
            throw new NumberFormatException("ISBNs must be 10 digits long at this point.");
        }
        if (isbn.length() == 13) {
            return true;
        }
        int total = 0;
        for (int i = 0; i < 10; i++) {
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
        return total % 11 == 0;
    }
}
