package com.company.basicmaths;

import java.util.Scanner;

public class ReverseNumber {

    static int reverseNumber(int num) {

        int digit = 0,reverse=0;
        while(num!=0){
            digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        return reverse;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(input.nextLine());
        System.out.println("AFTER REVERSING THE NUMBER: "+reverseNumber(number));
    }
}
