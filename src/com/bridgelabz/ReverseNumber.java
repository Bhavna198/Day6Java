package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        int temp = number;
        int reverse = 0, remainder = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        System.out.println("The Reverse Number of " + temp + " is = " + reverse);


    }
}

