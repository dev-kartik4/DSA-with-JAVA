package com.company.sorting;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int arr[]){

        for(int i=0;i<=arr.length-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {

        int[] numArray = new int[]{14,9,15,12,6,8,13};
        System.out.print("Original Array: "+ Arrays.toString(numArray));
        insertionSort(numArray);
        System.out.println("\nSorted Array: "+ Arrays.toString(numArray));
    }
}
