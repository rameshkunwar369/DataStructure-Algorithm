package com.ramesh.Basics01;

public class Factorial {
    public static void main(String[] args) {
        // Factorial of a give number => 4! == 4*3*2*1

        int n = 12;
        long factorial = 1;
        for (int i = n; i >=1 ; i--) {
            factorial = factorial *i;

        }
        System.out.println(factorial);
    }
}
