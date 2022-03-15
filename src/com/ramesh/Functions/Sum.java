package com.ramesh.Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int num1 = input.nextInt();
        System.out.printf("Enter second number: ");
        int num2 = input.nextInt();

      int answer =   sum(num1, num2);
        System.out.println("Sum of two numbers is: " + answer);
    }

    private static int sum(int n1, int n2) {
        int sumOfTwoNumbers = 0;
        return sumOfTwoNumbers = n1 + n2;


    }
}
