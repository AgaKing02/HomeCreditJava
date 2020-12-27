package com.company.basic.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the 3 sides");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Triangle exists");
        }else {
            System.out.println("Not exists");
        }

    }
}
