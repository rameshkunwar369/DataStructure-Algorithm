package com.ramesh.Basics01;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // print sum of even numbers till n no.
        System.out.print("enter the value of n: ");
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        int sum = 0, i = 0;

        while (i < num) {
            if (i % 2 == 0) {

                sum = sum + i;

            }
            i++;
        }
        System.out.println("Sum of first " + num + " numbers is : " + sum);
    }
}
