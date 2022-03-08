package com.ramesh.Basics01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Factorial of a give number => 4! == 4*3*2*1
Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = input.nextInt();
        long factorial = 1;
        for (int i = n; i >=1 ; i--) {
            factorial = factorial *i;

        }
        System.out.println(factorial);
    }
}
