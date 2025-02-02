package com.company.basicmaths;

import java.util.Scanner;

public class CheckPrimeNumber {

    static boolean isPrime(int N) {
        int count=0;
        for(int i=1;i<=N;i++){
            if(N%i==0) count++;
        }
        if(count == 2)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Number is Prime: "+isPrime(num));
    }
}
