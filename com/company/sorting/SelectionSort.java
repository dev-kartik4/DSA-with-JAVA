package com.company.sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr) {

        int min,temp;
        for(int i=0;i<=arr.length-2;i++) {
            min = i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[min]) {
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] numArray = new int[]{13,46,24,52,20,9};
        System.out.print("Original Array: "+ Arrays.toString(numArray));
        selectionSort(numArray);
        System.out.println("\nSorted Array: "+ Arrays.toString(numArray));
    }
}
