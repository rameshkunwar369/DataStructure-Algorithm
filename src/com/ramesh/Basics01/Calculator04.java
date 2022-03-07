package com.ramesh.Basics01;

import java.util.Scanner;

public class Calculator04 {
    public static void main(String[] args) {
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner input = new Scanner(System.in);
        System.out.printf("enter an operator('+' , '- ', '* ', '/ '): ");
        char operator = input.next().charAt(0);


        System.out.printf("Enter first number: ");
        float num1 = input.nextFloat();
        System.out.printf("Enter second number: ");
        float num2 = input.nextFloat();
        float result;

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            if (operator == '+') {
                result = num1 + num2;
                System.out.printf("Result is: " + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.printf("Result is: " + result);
            }else if (operator == '*') {
                result = num1 * num2;
                System.out.printf("Result is: " + result);
            }else if (operator == '/') {
                result = num1 / num2;
                System.out.printf("Result is: " + result);
            }
        }


    }
}
