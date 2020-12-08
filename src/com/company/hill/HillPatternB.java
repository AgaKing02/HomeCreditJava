package com.company.hill;

import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args) {
        System.out.println("Print the number");
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= rows; col++) {
                if (row >= col) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }

            }
            for (int col = 2; col <= rows; col++) { // пропустить col = 1
                if ((row + col >= rows + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
