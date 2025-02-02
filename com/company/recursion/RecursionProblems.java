package com.company.recursion;

import java.util.Arrays;
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

    static void printSumOfFirstNNumbersParameterizedRecursion(int N,int sum) {

        if(N < 1){
            System.out.println(sum);
            return;
        }
        printSumOfFirstNNumbersParameterizedRecursion(N-1, sum+N);
    }

    static int printSumOfFirstNumbersUsingFunctionalRecursion(int N) {

        if(N == 0)
            return 0;
        return N+printSumOfFirstNumbersUsingFunctionalRecursion(N-1);
    }

    static int[] reverseArrayUsingRecursion(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) { // base condition, nothing to do when there is one or no element to consider
            return array;
        }
        // swap array[startIndex] and array[endIndex]
        int temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;
        // recurse with the decreasing bounds
        return reverseArrayUsingRecursion(array, startIndex + 1, endIndex - 1);
    }

    static boolean checkStringPalindromeRecursion(String str, int startIndex, int endIndex) {

        if(startIndex == endIndex) return true;

        if(str.charAt(startIndex) != str.charAt(endIndex))
            return false;
        return checkStringPalindromeRecursion(str, startIndex+1, endIndex-1);
    }

    static int fetchNthFibonacciNumberRecursion(int N) {

        if(N<=1)
            return N;
        return fetchNthFibonacciNumberRecursion(N-1)+fetchNthFibonacciNumberRecursion(N-2);
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

        System.out.println("PRINTING SUM OF FIRST "+N+" NUMBERS USING PARAMETERIZED RECURSION");
        int sum = 0;
        printSumOfFirstNNumbersParameterizedRecursion(N,sum);

        System.out.println("PRINTING SUM OF FIRST "+N+" NUMBERS USING FUNCTIONAL RECURSION");
        System.out.println(printSumOfFirstNumbersUsingFunctionalRecursion(5));

        System.out.println("PRINTING REVERSE OF ARRAY USING RECURSION");
        int[] numArray = {1,3,2,5,4};
        System.out.println(Arrays.toString(reverseArrayUsingRecursion(numArray,0,numArray.length-1)));

        System.out.println("CHECK STRING PALINDROME");
        String word = "MADAMS";
        System.out.println(word+" IS PALINDROME: "+checkStringPalindromeRecursion(word,0,word.length()-1));

        System.out.println("FIBONACCI NUMBER AT POSITION: "+N+" IS:");
        System.out.println(fetchNthFibonacciNumberRecursion(N));
    }
}
