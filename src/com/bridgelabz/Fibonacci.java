package com.bridgelabz;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range till you want to display the Fibonnaci series");
        int n= sc.nextInt();
        System.out.println(" Fibonnaci series are");
        int a=0, b=1;
        int count=0;
        System.out.print(a+ " " +b);
        while (n>count){
            int c=a+b;
            a=b;
            b=c;
            count++;
            System.out.print(" " +c+ " ");

        }
    }


}
