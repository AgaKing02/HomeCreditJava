package com.company.minmax;

import java.util.Scanner;

public class MinMax4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min=1000;
        System.out.println("Type size");
        int size = in.nextInt();
        int at=0;

        for (int i=0;i<size;i++){
            System.out.println("Type a");
            int a = in.nextInt();
            if(a<min){
                min=a;
                at=i;
            }
        }

        System.out.println("Min number "+min+" at "+at);
    }
}
