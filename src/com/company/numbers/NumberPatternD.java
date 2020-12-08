package com.company.numbers;

import java.util.Scanner;

public class NumberPatternD {
    public static void main(String[] args) {
        System.out.println("Print the number");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        for (int row = 1; row <= size; row++) {
            String output = "";
            int count=size-row+1;
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    output += count;
                    count--;
                } else {
                    output += " ";
                }
            }
            System.out.println(output);
        }
    }
}
