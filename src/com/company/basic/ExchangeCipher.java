package com.company.basic;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the word to encode");

        String word = scanner.next().toLowerCase();
        System.out.println();

        for (char letter : word.toCharArray()) {
            System.out.print((char)('z'-(letter-'a')));
        }
    }
}
