package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the A ");
        int a = in.nextInt();
        System.out.println("Enter the D ");
        int d = in.nextInt();
        System.out.println("Enter the Size ");
        int size = in.nextInt();
        int[] arr=new int[size];
        arr[0]=a;
        for(int i=1;i<size;i++){
            arr[i]=a+d*(i);
        }
        System.out.println(Arrays.toString(arr));

    }
}
