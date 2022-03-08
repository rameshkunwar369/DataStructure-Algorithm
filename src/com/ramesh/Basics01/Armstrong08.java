package com.ramesh.Basics01;

import java.util.Scanner;

public class Armstrong08 {
    public static void main(String[] args) {
//        To find Armstrong Number between two given number.

//        123 => 1^3 + 2^3 + 3^3
//        12 => 1 ^2 + 2^2
//       1. first get individdual digits
//       2. count number of digits.
//        3. power individual digits and sum all the digits.

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();

        int originalNum = num;


//        to count length of a given number
        int length = 0;
        int tempNum = num;
        while (tempNum != 0) {
            length++;
            tempNum = tempNum / 10;
        }

        int sum = 0;
        int rem;
        while (num != 0) {
            rem = num % 10;

            int pow = (int) Math.pow(rem, length);
            num = num / 10;

            sum = sum + pow;
        }


        if (sum == originalNum) {
            System.out.println(originalNum + " is an armstrong number.");
        } else {
            System.out.println(originalNum + " is not an armstrong number.");
        }

    }
}
