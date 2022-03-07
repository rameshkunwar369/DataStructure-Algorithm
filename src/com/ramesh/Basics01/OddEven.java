package com.ramesh.Basics01;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.
        System.out.print("Enter a number: ");
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num%2 == 0){
            System.out.println("It is an even number. ");
        }else {
            System.out.println("it is an odd number. ");
        }
    }
}
