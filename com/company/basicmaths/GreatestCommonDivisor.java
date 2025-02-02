package com.company.basicmaths;

import java.util.Scanner;

public class GreatestCommonDivisor {

    static int gcd(int a, int b) {

        while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a == 0) return b;
        else return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("GREATEST COMMON DIVISOR OF ("+a+","+b+") IS: "+gcd(a, b));
    }
}
