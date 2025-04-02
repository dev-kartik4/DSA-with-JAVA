package com.company.arrays;

public class LargestNumberInAnArray {

    public static int findLargestNumber(int[] arr) {

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numArray[] = {3,2,1,5,2};
        System.out.println("LARGEST NUMBER IN THE GIVEN ARRAY IS"+findLargestNumber(numArray));
    }
}
