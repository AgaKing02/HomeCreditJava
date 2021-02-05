package com.company.minmax;

import java.util.Scanner;

public class MinMax5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxDensity = 0;
        System.out.println("Type size");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Type mass and volume");
            double mass = scanner.nextInt();
            double volume = scanner.nextInt();
            if ((mass / volume) > maxDensity) {
                maxDensity = mass / volume;
            }
        }
        System.out.println("Max density is "+maxDensity);
    }
}
