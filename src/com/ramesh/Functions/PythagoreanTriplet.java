package com.ramesh.Functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
//        Write a function to check if a given triplet is a Pythagorean triplet or not.
//        (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int num1 = input.nextInt();
        System.out.printf("Enter second number: ");
        int num2 = input.nextInt();
        System.out.printf("Enter third number: ");
        int num3 = input.nextInt();

        boolean answer = isPythagoreanTruplet(num1, num2, num3);
        System.out.println(answer);

    }

    private static boolean isPythagoreanTruplet(int n1, int n2, int n3) {
        int sum = n1 * n1 + n2 * n2;
        if (sum == n3) {
            return true;
        } else {
            return false;
        }

    }
}
