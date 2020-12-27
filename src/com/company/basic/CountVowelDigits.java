package com.company.basic;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print String");
        String word = scanner.next();
        word=word.toLowerCase();
        int length=word.length();
        int digits = 0, vowels = 0;

        for (int start = 0; start <= word.length()-1; start++) {
            char letter = word.charAt(start);
            if (letter >= '0' && letter <= '9') {
                digits++;
            } else if (letter == 'i' || letter == 'e' || letter == 'a' || letter == 'o' ||letter=='u'){
                vowels++;
            }
        }
        if (vowels>0){
            System.out.println("Vowels "+vowels+" ("+Math.round(vowels*100/(double)length)+")%");
        }
        if(digits>0){
            System.out.println("Digits "+digits+" ("+Math.round(digits*100/(double)length)+")%");

        }
    }
}
