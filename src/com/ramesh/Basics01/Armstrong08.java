package com.ramesh.Basics01;

public class Armstrong08 {
    public static void main(String[] args) {
//        To find Armstrong Number between two given number.

//        123 => 1^3 + 2^3 + 3^3
//        12 => 1 ^2 + 2^2
//       1. first get individdual digits
//       2. count number of digits.
//        3. power individual digits and sum all the digits.

        int num = 123;
        int rem;
        int i = 0;
        int sum = 0;
        
        while (i < 3) {
            double cube = 0;
            rem = num % 10;
            System.out.println("rem = " + rem);
            cube = Math.pow(rem, 3);
            num = num / 10;
            System.out.println(cube);
            sum += cube;
            System.out.printf("I = " + sum);
            i++;

        }


    }
}
