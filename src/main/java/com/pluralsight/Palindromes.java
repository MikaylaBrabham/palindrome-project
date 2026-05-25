package com.pluralsight;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {

        //add scanner
        Scanner myScanner = new Scanner(System.in);

        //add initial value
        float palindromes = 0;

        //create nested for loop
        for (float i = 100; i <= 999; i++) {

            for (float j = 100; j <= 999; j++) {

                //add logic for 2 numbers three digits
                float product = i * j;

                //convert to string regular way forward
                String original = String.valueOf(product);

                //convert to string backward way
                String reverse = new StringBuilder(original).reverse().toString();

                if(original.equals(reverse)) {

                    if (product > palindromes) {
                        palindromes = product;
                    }
                }



            }
        }
        System.out.println("The largest palindrome is " + palindromes);
    }

}
