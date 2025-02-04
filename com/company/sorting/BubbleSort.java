package com.company.sorting;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        int temp;
        for(int i=arr.length-1;i>=0;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
    }
    public static void main(String[] args) {

        int[] numArray = new int[]{13,46,24,52,20,9};
        System.out.print("Original Array: "+ Arrays.toString(numArray));
        bubbleSort(numArray);
        System.out.println("\nSorted Array: "+ Arrays.toString(numArray));
    }
}
