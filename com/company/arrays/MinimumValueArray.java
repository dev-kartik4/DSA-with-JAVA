package com.company.arrays;

public class MinimumValueArray {

    public static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(" ");
    }

    public static int[] minimumValue(int[] numbers){

        int temp=0;
        for(int i=0;i<=numbers.length - 1;i++){
            for(int j=i+1;j<=numbers.length-1;j++){
                if(numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static void main(String args[]){
        int numbers[] = {3,2,4,7,10,6,5};
        System.out.println("PRINTING ARRAY ELEMENTS ");
        printArray(numbers);

        minimumValue(numbers);
        System.out.println("AFTER ASCENDING ORDER");
        printArray(numbers);

        System.out.println("MINIMUM VALUE IS "+numbers[0] +"\n"+"SECOND MINIMUM VALUE IS "+numbers[1]);
        System.out.println("MAXIMUM VALUE IS "+numbers[numbers.length - 1] +"\n"+"SECOND MAXIMUM VALUE IS "+numbers[numbers.length - 2]);

    }
}
