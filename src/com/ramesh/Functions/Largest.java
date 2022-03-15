package com.ramesh.Functions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        // Program to print largest number among 3 numbers.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter num1: ");
        int num1 = input.nextInt();
        System.out.printf("Enter num2: ");

        int num2 = input.nextInt();
        System.out.printf("Enter num3: ");

        int num3 = input.nextInt();

        int large = largest(num1, num2, num3);
        System.out.println(large + " is largest number among three numbers");
    }

    private static int largest(int n1, int n2, int n3) {
        int greatest = n1;
        if (n1 > n2 && n1 > n3) {
            greatest = n1;
        } else if (n2 > n1 && n2 > n3) {
            greatest = n2;
        } else if (n3 > n2 && n3 > n1) {
            greatest = n3;
        }
        return greatest;
    }

}
