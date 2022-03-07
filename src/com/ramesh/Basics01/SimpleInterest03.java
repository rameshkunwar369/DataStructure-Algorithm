package com.ramesh.Basics01;

import java.util.Scanner;

public class SimpleInterest03 {
    public static void main(String[] args) {
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
      float principal , time, rate;
      float SI;
      Scanner input = new Scanner(System.in);
        System.out.printf("Enter Principal: ");
        principal = input.nextFloat();
        System.out.printf("Enter time in years: ");
        time = input.nextFloat();
        System.out.printf("Enter rate: ");
        rate = input.nextFloat();

        SI = (principal*time*rate) /100;
        System.out.printf("Simple interest is: "+ SI);

    }
}
