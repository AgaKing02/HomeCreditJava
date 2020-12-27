package com.company.basic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Print String");
        String word=scanner.next();

        for(int start=word.length()-1;start>=0;start--){
            System.out.print(word.charAt(start));
        }
    }
}
