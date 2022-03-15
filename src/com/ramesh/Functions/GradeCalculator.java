package com.ramesh.Functions;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        /**
         Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:


         Marks        Grade
         91-100         AA
         81-90          AB
         71-80          BB
         61-70          BC
         51-60          CD
         41-50          DD
         <=40          Fail
         **/
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your marks: ");
        float marks = input.nextFloat();
        
     String  answer =    calculateGrade(marks);
        System.out.println("Your grade is : " + answer);

    }

    private static String calculateGrade(float m) {
        String grade = "" ;
        if (m <= 40){
        grade = "Fail";
        }else if(m > 40 && m <=50){
           grade = "DD";
        }else if(m > 50 && m <=60){
            grade = "CD";
        }else if(m > 60 && m <=70){
            grade = "BC";
        }else if(m > 70 && m <=80){
            grade ="BB";
        }else if(m > 80 && m <=90){
            grade ="AB";
        }else if(m > 90 && m <=100){
            grade ="AA";
        }else{
            System.out.println("Please enter a correct marks. ");
        }
        return grade;
    }
}
