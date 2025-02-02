package com.company.basicmaths;

import java.util.Scanner;

public class PrintAllDivisors {

    static void printAllDivisors(int N) {

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Printing all divisors of " + number + " is:");
        printAllDivisors(number);
    }
}
