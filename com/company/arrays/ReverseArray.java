package com.company.arrays;

public class ReverseArray {

    public static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(" ");
    }

    public static void reverseArray(int[] numbers,int start,int end){
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {3,2,4,7,10,6,5};
        System.out.println("PRINTING ARRAY ELEMENTS ");
        printArray(numbers);
        System.out.println("AFTER ARRAY REVERSAL ");
        reverseArray(numbers,0,numbers.length - 1);
        printArray(numbers);
    }
}
