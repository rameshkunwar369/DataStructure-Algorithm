package com.ramesh.Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Write a function to find if a number is a palindrome or not. Take number as parameter.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();
     boolean answer =    isPalindrome(num);
        System.out.println(answer);
    }

    private static boolean isPalindrome(int n) {
        boolean palindrome = false;
        int originalNum = n;
        int reverse = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;

            n = n / 10;
        }
        System.out.println("Reverse of a given number is : " + reverse);
        if (originalNum == reverse) {
            return true;
        } else {
            return false;
        }

    }
}
// individual digit from last