package com.company.arrays;

import java.util.HashMap;
import java.util.Map;

public class MissingNumberInArray {

    public static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(" ");
    }

    public static int findMissingNumberBruteForce(int[] numbers) {
        int N = numbers.length;
        for (int i = 1; i <= N; i++) {

            int flag = 0;

            for (int j = 0; j < N - 1; j++) {
                if (numbers[j] == i) {

                    flag = 1;
                    break;
                }
            }

            if (flag == 0) return i;
        }

        return -1;
    }

    public static int findMissingNumberBetterApproach(int[] numbers,int N){
        int[] hash = new int[N + 1]; //hash array

        for (int i = 0; i < N - 1; i++)
            hash[numbers[i]]++;

        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static int findMissingNumberOptimalApproach1(int[] numbers){
        int n = numbers.length + 1;
        int sum = n * (n+1)/2;
        for(int num : numbers){
            sum = sum-num;
        }
        return sum;
    }

    public static void main(String args[]) {
        int[] numbers = {1, 3, 6, 8, 2, 4, 7};
        int N = 8;
        System.out.println("PRINTING ARRAY ELEMENTS ");
        printArray(numbers);

        System.out.println("BRUTE FORCE -> THE MISSING NUMBER OF THE ABOVE ARRAY IS "+findMissingNumberBruteForce(numbers));
        System.out.println("OPTIMAL APPROACH 1 -> THE MISSING NUMBER OF THE ABOVE ARRAY IS "+findMissingNumberOptimalApproach1(numbers));
        System.out.println("BETTER APPROACH -> THE MISSING NUMBER OF THE ABOVE ARRAY IS "+findMissingNumberBetterApproach(numbers,N));
    }
}
