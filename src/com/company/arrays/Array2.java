package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=1;i<size+1;i++){
            arr[i-1]=(i*2);
        }
        System.out.println(Arrays.toString(arr));

    }
}
