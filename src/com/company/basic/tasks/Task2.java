package com.company.basic.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int count = 0;
        System.out.println("Please enter grades until negative grade");
        boolean IsNegative=false;
        while (true) {
            int nextGrade=scanner.nextInt();
            if(nextGrade>0){
                sum+=nextGrade;
                count++;
            }else {
                break;
            }
        }
        System.out.println("Sum of grades " + sum + " and average is " + (sum / (count)));
    }
}
