package com.company.basicmaths;

import java.util.Scanner;

public class CountDigits {

    static int countDigits(int number) {

        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        System.out.println("Digits Count is: "+countDigits(number));
    }
}
