package com.ramesh.Basics01;

import java.util.Scanner;

public class Fibonacci07 {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int a = 0;
        int b = 1;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter nth number: ");
        int n = input.nextInt();

        System.out.println(a);
        System.out.println(b);

        int i = 0;
        while (i < n-2) {
            c = a + b;
            a = b;
            b = c;
            i++;
            System.out.println(c);
        }
    }
}
