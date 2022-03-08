package com.ramesh.Basics01;

public class LeetCode01 {
    public static void main(String[] args) {
//        Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//
//
//                Example 1:
//
//        Input: n = 234
//        Output: 15
//        Explanation:
//        Product of digits = 2 * 3 * 4 = 24
//        Sum of digits = 2 + 3 + 4 = 9
//        Result = 24 - 9 = 15


        int num = 234;
        int rem;
        int product = 1, sum = 0, result = 0;
        while (num != 0) {
            rem = num % 10;

            sum = sum + rem;
            product = product * rem;

            num = num / 10;

        }
        result = product - sum;
        System.out.println(result);


    }
}
