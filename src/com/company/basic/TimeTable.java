package com.company.basic;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        System.out.println("Print the number");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int row = 1; row <= size; row++) {
            String output = row + " | ";

            for (int col = 1; col <= size; col++) {
                // col = 1, 2, 3, ..., size
                output += row * col + " ";
            }
            System.out.println(output);
        }
    }
}
