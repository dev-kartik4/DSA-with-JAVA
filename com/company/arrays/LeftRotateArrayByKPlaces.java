package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayByKPlaces {

    static void leftRotateArrayByKPlaces(int[] arr, int k) {
        int N = arr.length;
        k = k % N;
        for(int i=1; i<k; i++){
            reverseArray(arr, 0, N-1);
            reverseArray(arr, 0, N-2);
        }
    }

    static void reverseArray(int[] arr,int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numArray[] = {1,2,3,4,5,6,7};

        System.out.println("Original Array: "+ Arrays.toString(numArray));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter K: ");
        int k = sc.nextInt();
        System.out.println("Left Rotate Array By K Places: where K = "+k);
        leftRotateArrayByKPlaces(numArray, k);
        System.out.println("Rotated Array: "+ Arrays.toString(numArray));
    }
}
