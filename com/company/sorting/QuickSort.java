package com.company.sorting;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i] <= pivot && i <= high - 1){
                i++;
            }
            while(arr[j] >= pivot && j >= low+1){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void quickSort(int[] arr,int low,int high){

        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static void main(String[] args) {
        int[] numArray = {10,16,8,12,15,6,3,9,5};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numArray));
        quickSort(numArray,0,numArray.length-1);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(numArray));
    }
}
