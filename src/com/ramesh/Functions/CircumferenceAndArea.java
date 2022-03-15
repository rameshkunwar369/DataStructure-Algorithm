package com.ramesh.Functions;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        System.out.println("hell");
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the value of radius: ");
        int radius = input.nextInt();
        int circumferenceOfACircle = circumference(radius);
        int areaOfACircle = area(radius);
        System.out.println(circumferenceOfACircle + " is the circumference of a circle. ");
        System.out.println(areaOfACircle + " is the area of a circle. ");
    }

    private static int area(int radius) {
        int answer = 22 / 7 * radius * radius;
        return answer;
    }

    private static int circumference(int radius) {
        int answer = 2 * 22 / 7 * radius;
        return answer;
    }
}
