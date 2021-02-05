package com.company.minmax;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = in.nextInt();
        int[] arr = new int[size];
        int max = 0;
        int min = 10000;

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
