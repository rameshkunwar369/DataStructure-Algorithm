package com.ramesh.Basics01;

import java.util.Scanner;

public class GreatestNumber05 {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        num1 = input.nextInt();
        System.out.printf("Enter second number: ");
        num2 = input.nextInt();
        
        if (num1 == num2){
            System.out.println("Both numbers are equal");
        }else if(num1 > num2){
            System.out.println(num1 + " is greater  " );
        }else if(num1 < num2){
            System.out.println(num2 + " is greater  " );
        }
    }
}
