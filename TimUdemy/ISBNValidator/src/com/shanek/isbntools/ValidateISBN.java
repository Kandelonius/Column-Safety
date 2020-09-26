package com.shanek.isbntools;

public class ValidateISBN {
    public static void main(String[] args) {
        System.out.println("hello world!");
    }

    public boolean checkISBN(String isbn) {
        if (isbn.length() != 10 && isbn.length() != 13) {
            throw new NumberFormatException("ISBNs must be 10 digits long at this point.");
        }
        int total = 0;
        if (isbn.length() == 13) {
            for (int i = 0; i < 12; i++) {
                if(Character.isDigit(isbn.charAt(i)) && i % 2 == 1) {
                    total += Character.getNumericValue(isbn.charAt(i));
                } else if(Character.isDigit(isbn.charAt(i)) && i % 2 == 0) {
                    total += Character.getNumericValue(isbn.charAt(i)) * 3;
                }
            }
        } else {
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
        }
        return total % 11 == 0;
    }
}
