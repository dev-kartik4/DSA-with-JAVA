package com.company.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    private static void mergeArray(int[] arr,int low,int mid,int high){

        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                tempList.add(arr[left]);
                left++;
            }else{
                tempList.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            tempList.add(arr[left]);
            left++;
        }

        while(right <= high){
            tempList.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = tempList.get(i-low);
        }
    }
    static void mergeSort(int[] arr,int low,int high) {

        if(low >= high)
            return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeArray(arr,low,mid,high);
    }
    public static void main(String[] args) {

        int[] numArray = new int[]{3,1,2,4,1,5,2,6,4};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numArray));
        mergeSort(numArray,0,numArray.length-1);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(numArray));
    }
}
