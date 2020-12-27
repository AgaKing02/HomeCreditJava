package com.company.basic;

import java.util.Scanner;

public class PhoneKeyPad {
    /*: ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).*/
    public static void main(String[] args) {
        System.out.println("Print String");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toLowerCase();
        for (char letter : word.toCharArray()) {
            switch (letter) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print(2);
                    continue;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print(3);
                    continue;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print(4);
                    continue;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print(5);
                    continue;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print(6);
                    continue;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print(7);
                    continue;
                case 't':
                case 'u':
                case 'v':
                    System.out.print(8);
                    continue;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print(9);
                    continue;
                default:break;

            }
        }

    }
}
