package com.company.arrays;

public class MissingNumberInArray {

    public static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(" ");
    }

    public static int findMissingNumber(int[] numbers){
        int n = numbers.length + 1;
        int sum = n * (n+1)/2;
        for(int num : numbers){
            sum = sum-num;
        }
        return sum;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 3, 6, 8, 2, 4, 7};
        System.out.println("PRINTING ARRAY ELEMENTS ");
        printArray(numbers);

        System.out.println("THE MISSING NUMBER OF THE ABOVE ARRAY IS "+findMissingNumber(numbers));
    }
}
