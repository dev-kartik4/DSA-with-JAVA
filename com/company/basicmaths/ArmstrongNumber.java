package com.company.basicmaths;

import java.util.Scanner;

public class ArmstrongNumber {

    static boolean isArmstrong(int number) {

        int digit = 0,sum = 0,num=number;
        while(num != 0) {
            digit=num%10;
            sum += (int) Math.pow(digit,String.valueOf(number).length());
            num /= 10;
        }
        return number == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("NUMBER IS ARMSTRONG: "+isArmstrong(number));
    }
}
