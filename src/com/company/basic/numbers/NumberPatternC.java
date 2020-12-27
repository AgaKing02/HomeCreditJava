package com.company.basic.numbers;

import java.util.Scanner;

public class NumberPatternC {
    public static void main(String[] args) {
        System.out.println("Print the number");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        for (int row = 1; row <= size; row++) {
            String output = "";
            int count=0;
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    count++;
                    output += count;
                } else {
                    output += " ";
                }
            }
            System.out.println(output);
        }
    }
}
