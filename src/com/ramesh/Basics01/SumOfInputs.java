package com.ramesh.Basics01;

import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
//        Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            System.out.printf("Enter a number: ");
            num = input.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("Sum of given numbers is: " + sum);


    }
}
