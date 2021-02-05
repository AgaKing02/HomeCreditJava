package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=(2*i+1);
        }
        System.out.println(Arrays.toString(arr));

    }
}
