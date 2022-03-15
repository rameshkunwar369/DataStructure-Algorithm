package com.ramesh.Functions;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
//        Write a function that returns the sum of first n natural numbers.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();
    int answer =     sumOfN(num);
        System.out.println("Sum of first " + num + " is " + answer);
    }

    private static int sumOfN(int n) {
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum = n +i;
        }
        System.out.println(sum);
        return  sum;
    }
}
