package com.company.arrays;

public class CheckIfArrayIsSorted {

    public static boolean isArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1]){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int numArray[] = {1,2,2,3,3,4};
        System.out.println("IS ARRAY SORTED ? "+isArraySorted(numArray));
    }
}
