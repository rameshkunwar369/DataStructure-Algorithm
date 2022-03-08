package com.ramesh.Basics01;

import java.util.Scanner;

public class ConditionalCalculation {
    public static void main(String[] args) {
//        Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list
//        of numbers (N) entered by the user. The list terminates when the user enters a zero.
        int n;
        int sumOfNegative = 0;
        int sumOfPositiveEven = 0;
        int sumofPositiveOdd = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.printf("Enter a number: ");
            n = input.nextInt();
            if (n<0){
                sumOfNegative+= n;
            }else if (n%2 ==0){
                sumOfPositiveEven += n;
            }else  if (n%2 !=0){
                sumofPositiveOdd+=n;
            }
        }while (n!=0);
        System.out.printf("Sum of Negative number is: " + sumOfNegative + "\n");
        System.out.printf("Sum of Positive Even number is: " + sumOfPositiveEven+ "\n");
        System.out.printf("Sum of Positive Odd number is: " + sumofPositiveOdd+ "\n");

    }
}
