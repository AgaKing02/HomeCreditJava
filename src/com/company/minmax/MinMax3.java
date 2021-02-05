package com.company.minmax;

import java.util.Scanner;

public class MinMax3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many rectangles:");
        int size = in.nextInt();
        int max=0;
        for (int i=0;i<size;i++){
            System.out.println("Type a and b");
            int a = in.nextInt();
            int b = in.nextInt();
            if((a*b)>max){
                max=a*b;
            }
        }

        System.out.println("Area Max "+max);
    }
}
