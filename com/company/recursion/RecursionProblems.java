package com.company.recursion;

import java.util.Scanner;

public class RecursionProblems {

    static void printNameNTimes(int i, int N) {

        if(i > N)
            return;
        System.out.println("KARTIK");
        printNameNTimes(i+1, N);
    }

    static void printNumbersLinearlyFrom1toN(int i, int N) {

        if(i > N)
            return;
        System.out.println(i+" ");
        printNumbersLinearlyFrom1toN(i+1, N);
    }

    static void printNumbersFromNTo1(int i, int N) {

        if(i < 1)
            return;
        System.out.println(i+" ");
        printNumbersFromNTo1(i-1, N);
    }

    static void printFrom1toNByBackTracking(int i, int N) {

        if(i < 1)
            return;
        printFrom1toNByBackTracking(i-1, N);
        System.out.println(i+" ");
    }

    static void printFromNTo1ByBackTracking(int i, int N) {

        if(i > N)
            return;
        printFromNTo1ByBackTracking(i+1, N);
        System.out.println(i+" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = scanner.nextInt();
        System.out.println("Enter the start: ");
        int i = scanner.nextInt();
        System.out.println("PRINTING THE NAME N TIMES");
        printNameNTimes(i, N);
        System.out.println("PRINTING LINEARLY FROM 1 TO N");
        printNumbersLinearlyFrom1toN(i,N);
        System.out.println("PRINTING LINEARLY FROM N TO 1");
        printNumbersFromNTo1(N,N);
        System.out.println("PRINTING IN BACKTRACKING WAY FROM 1 TO N");
        printFrom1toNByBackTracking(N,N);
        System.out.println("PRINTING IN BACKTRACKING WAY FROM N TO 1");
        printFromNTo1ByBackTracking(i,N);
    }
}
