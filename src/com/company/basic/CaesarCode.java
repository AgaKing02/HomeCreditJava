package com.company.basic;

import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        final int increment=3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the word to encode");
        String word = scanner.next().toLowerCase();

//        for (char letter : word.toCharArray()) {
//            if(letter<'z'-increment){
//                System.out.print((char)(letter+increment));
//            }else {
//                System.out.print((char)((increment+letter-(int)'z')+'a'));
//            }
//        }
        System.out.println();
        for (char letter : word.toCharArray()) {
            if(letter>'a'+increment){
                System.out.print((char)(letter-increment));
            }else {
                System.out.print((char)(increment-letter+(int)'a')-'z');
            }
        }
    }
}
