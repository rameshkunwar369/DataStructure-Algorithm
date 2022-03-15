package com.ramesh.Functions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // odd even using a function
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();

        isOddEven(num);
    }

    private static void isOddEven(int n) {
        if (n %2 == 0) {
            System.out.println("It is an even number. ");
        }else{
            System.out.println("It is an odd number. ");
        }

    }
}
