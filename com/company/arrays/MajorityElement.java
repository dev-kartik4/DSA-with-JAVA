package com.company.arrays;

public class MajorityElement{

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int findMajorityElement(int[] arr){
        int ansIndex = 0;
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[ansIndex]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                ansIndex = arr[i];
                count = 1;
            }
        }
        return ansIndex;
    }
    public static void main(String args[]){
        int[] arr = {2,1,2,3,1};
        System.out.println("PRINTING ARRAY ELEMENTS ");
        printArray(arr);

        System.out.println("MOST REPEATED ELEMENT IS "+findMajorityElement(arr));
    }
}
