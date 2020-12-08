package com.company.box;

import java.util.Scanner;

public class BoxPatternB {
    public static void main(String[] args) {
        System.out.println("Print the number");
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        for (int row = 1; row <= size; row++) {
            String output = "";
            for (int col = 1; col <= size; col++) {
                if ((row == 1 || row == size || row == col)) {
                    output += "#";
                } else {
                    output += " ";
                }
            }
            System.out.println(output);
        }
    }
}
