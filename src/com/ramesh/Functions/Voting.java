package com.ramesh.Functions;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
//        A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter voter age: ");
        int age = input.nextInt();


        boolean answer = isEligible(age);
        System.out.println(answer);
    }

    private static boolean isEligible(int n) {
        if (n >= 18) {
            return true;
        } else {
            return false;
        }

    }
}
