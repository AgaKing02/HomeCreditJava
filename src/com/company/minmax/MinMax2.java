package com.company.minmax;

import java.util.Scanner;

public class MinMax2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many rectangles:");
        int size = in.nextInt();
        int min=1000;
        for (int i=0;i<size;i++){
            System.out.println("Type a");
            int a = in.nextInt();
            System.out.println("Type b");

            int b = in.nextInt();

            if((a*b)<min){
                min=a*b;
            }
        }

        System.out.println("Area Min "+min);
    }
}
