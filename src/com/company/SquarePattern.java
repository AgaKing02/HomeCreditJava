package com.company;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args){
        System.out.println("Print the number");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        for (int i=0;i<number;i++){
            String output="";
            for (int j=0;j<number;j++){
             output+=" #";
            }
            System.out.println(output);
        }
    }
}
