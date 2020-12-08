package com.company.tasks;

import java.util.Scanner;

public class Task0 {
    /**
     * Создайте программу, которая будет принимать две группы параметров:
     * - количество циклов выполнения программы;
     * - 3 числа a, b, n
     * и выводить на экран последовательность результатов вычисления следующего выражения
     * (a + 2^0*b),(a + 2^0*b + 2^1*b),(a + 2^0*b + 2^1*b + 2^2*b)..., (a+2^0*b + 2^1*b + 2^2*b +...+ 2^(n-1)*b)
     * где ^ обозначает возведение в степень, и эта операция выполняется до умножения.
     *
     *  Для ввода значений с консоли Вам понадобится класс Scanner.
     *   <code>Scanner scanner = new Scanner(System.in);</code>
     *   <code>scanner.nextInt();</code>
     *
     * Пример:
     *  Please enter the number of iterations
     *   2
     *  Enter the group of 3 numbers
     *   0 2 10
     *  Output:
     *   2 6 14 30 62 126 254 510 1022 2046
     *  Enter the group of 3 numbers
     *   5 3 5
     *  Output:
     *  8 14 26 50 98
     *
     *  Пример:
     *  a=5, b=3, n=5
     *  (5+2^0*3)=8,(5+2^0*3 + 2^1*3)=14,(5+2^0*3 + 2^1*3 + 2^2*3)=26,(5+2^0*3 + 2^1*3 + 2^2*3 + 2^3*3)=50,
     *  (5+2^0*3 + 2^1*3 + 2^2*3 + 2^3*3 + 2^4*3)=98
     *
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the 3 numbers");
        int count=0;
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int n=scanner.nextInt();
        while(count<=n-1){
            System.out.println(a+=(Math.pow(2,count))*b);
            count++;
        }

    }
}
