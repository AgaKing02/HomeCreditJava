package com.company.handlers;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean isRunning = true;

        System.out.println("Application started");
        System.out.println("__________________________________");
        System.out.println("Author: Agakhan Peiishbek");
        System.out.println("__________________________________");

        while (isRunning) {
            if (count == 0) {
                System.out.println("1 To Start Calculation");
                count++;
            } else {
                System.out.println("1 To Continue Calculation");
            }
            System.out.println("  Else To Finish the Calculation");
            try {

                if (scanner.nextInt() == 1) {
                    System.out.println("Print the first number");
                    int firstInt = Integer.parseInt(scanner.next());
                    System.out.println("Print the second number");
                    int secondInt = Integer.parseInt(scanner.next());
                    System.out.println("Choose operation {*,/,+,-} ");
                    String operation = scanner.next();
                    try {
                        switch (operation) {
                            case "*":
                                System.out.println("Answer is:" + firstInt + operation + secondInt + " = " + (firstInt * secondInt));
                                continue;
                            case "/":
                                if (secondInt == 0) throw new DivisionByZero("IMPOSSIBLE TO DIVIDE BY 0");
                                System.out.println("Answer is:" + firstInt + operation + secondInt + " = " + (firstInt / secondInt));
                                continue;
                            case "-":
                                System.out.println("Answer is:" + firstInt + operation + secondInt + " = " + (firstInt - secondInt));
                                continue;

                            case "+":
                                System.out.println("Answer is:" + firstInt + operation + secondInt + " = " + (firstInt + secondInt));
                                continue;
                            default:
                                throw new OperationNotFoundException("Wrong operation " + operation);
                        }
                    } catch (DivisionByZero | OperationNotFoundException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Program shut down");
                    isRunning = false;
                }
            } catch (NumberIsNeededException exception) {
                exception.printStackTrace();
            }
        }
    }
}
