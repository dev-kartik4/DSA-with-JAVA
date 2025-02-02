package com.company.basicmaths;

import java.util.Scanner;

public class CheckNumberPalindrome {

    static boolean checkNumberPalindrome(int number) {
        int digit = 0,reverse = 0;
        int num = number;
        while (num != 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse == number;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("NUMBER IS PALINDROME: "+checkNumberPalindrome(number));
    }
}
