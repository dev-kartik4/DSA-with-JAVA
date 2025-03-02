package com.company.arrays;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {

    static void leftRotateArrayByOnePlace(int[] arr, int k) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    static void leftRotateArrayByKPlaces(int[] arr, int k) {
        int n = arr.length;

        k = k % n;

        for (int i = 1; i < k; i++) {
            reverse(arr, 0, n - 1);
            reverse(arr, 0, n - 2);
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {

        int[] numArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(numArray));
        leftRotateArrayByOnePlace(numArray, 1);
        System.out.println("After Rotating By One Place: ");
        System.out.println(Arrays.toString(numArray));

        leftRotateArrayByKPlaces(numArray, 2);
        System.out.println("After Rotating By K Places: ");
        System.out.println(Arrays.toString(numArray));

        int[] tempArray = new int[]{};
        tempArray[0]=1;
        System.out.println(Arrays.toString(tempArray));
    }
}
