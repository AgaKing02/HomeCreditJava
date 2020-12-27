package com.company.basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;

        System.out.println("Application started");
        System.out.println("__________________________________");
        System.out.println("Author: Agakhan Peiishbek");
        System.out.println("__________________________________");

        while (true) {
            if(count==0){
                System.out.println("1 To Start Calculation");
                count++;
            }else{
                System.out.println("1 To Continue Calculation");
            }
            System.out.println("  Else To Finish the Calculation");
            if (scanner.nextInt() == 1) {
                System.out.println("Print the first number");
                int firstInt = scanner.nextInt();
                System.out.println("Print the second number");
                int secondInt = scanner.nextInt();
                System.out.println("Choose operation {*,/,+,-} ");
                String operation = scanner.next();

                switch (operation) {
                    case "*":
                        System.out.println("Answer is:"+firstInt + operation + secondInt + " = " + (firstInt * secondInt));
                        continue;
                    case "/":
                        System.out.println("Answer is:"+firstInt + operation + secondInt + " = " + (firstInt / secondInt));
                        continue;
                    case "-":
                        System.out.println("Answer is:"+firstInt + operation + secondInt + " = " + (firstInt - secondInt));
                        continue;

                    case "+":
                        System.out.println("Answer is:"+firstInt + operation + secondInt + " = " + (firstInt + secondInt));
                        continue;
                    default:
                        System.out.println("Wrong operation");
                        break;
                }

                return;
            }else {
                System.out.println("Program shut down");
                break;
            }
        }

    }
}
