package com.ramesh.Functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("hel");
        System.out.printf("Enter the value of N: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean ans = isArmstrong(num);
        System.out.println(ans);

        System.out.printf("Enter the range: ");
        int range = input.nextInt();
        allArmstrong(range);
    }

    private static void allArmstrong(int range) {
        for (int i = 10; i < range; i++) {
            if (isArmstrong(i)) {
                System.out.println("Armstrong is: " + i);
            }
        }
    }


    private static boolean isArmstrong(int n) {
        int rem, sum = 0, cube;
        int originalNumber = n;
        int countNumber = n, count = 0;
        while (countNumber > 0) {
            count++;
            countNumber = countNumber / 10;

        }

        while (n > 0) {
            rem = n % 10;


            cube = (int) Math.pow(rem, count);
            sum = sum + cube;
            n = n / 10;
        }
        if (sum == originalNumber) {
            return true;
        } else {
            return false;
        }


    }


}
