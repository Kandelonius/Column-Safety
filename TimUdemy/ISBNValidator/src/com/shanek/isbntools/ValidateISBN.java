package com.shanek.isbntools;

public class ValidateISBN {
    public static void main(String[] args) {
        System.out.println("hello world!");
    }

    public boolean checkISBN(String isbn) {
        if (isbn.length() != 10) {
            throw new NumberFormatException("ISBNs must be 10 digits long at this point.");
        }
        int total = 0;
        for (int i = 0; i < 10; i++) {
            String temp = isbn.charAt(i);
            try {
                Integer.parseInt(isbn.charAt(i));
            } catch (NumberFormatException nfe) {
                throw new NumberFormatException("ISBNs must be numeric");
            }
            total += isbn.charAt(i) * (10 - i);
        }
        return total % 11 == 0;
    }
}
