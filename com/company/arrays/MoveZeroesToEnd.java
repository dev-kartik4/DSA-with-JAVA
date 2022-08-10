package com.company.arrays;

public class MoveZeroesToEnd {

    public static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(" ");
    }

    public static void moveZerosToEnd(int[] numbers){
        int j=0,temp=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] != 0 && numbers[j]==0){
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
            if(numbers[j] != 0)
                j++;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {8,1,0,2,1,0,3};
        System.out.println("PRINTING ARRAY ELEMENTS ");
        printArray(numbers);

        moveZerosToEnd(numbers);
        System.out.println("AFTER MOVING ZEROES TO END ");
        printArray(numbers);
    }
}
