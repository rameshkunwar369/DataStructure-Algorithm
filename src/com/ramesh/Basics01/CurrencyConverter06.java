package com.ramesh.Basics01;

import java.util.Scanner;

public class CurrencyConverter06 {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Nepalese rupees: ");
        float nrs = input.nextFloat();
        float USD = nrs / 100;
        System.out.println("Nrs." + nrs + " in USD is $ " + USD);

    }
}
