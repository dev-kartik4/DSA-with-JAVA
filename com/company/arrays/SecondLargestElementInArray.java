package com.company.arrays;

public class SecondLargestElementInArray {

    public static int findSecondLargestBruteForce(int[] arr) {
        //GENERALLY ARRAY CAN BE SORTED AND THAT WOULD TAKE AROUND 0(N LOG N)
        int N = arr.length;
        int largest = arr[N-2];
        int secondLargest = arr[1];
        for(int i = N-2; i>=0; i--) {
            if(arr[i] != largest){
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    public static int findSecondLargestBetterApproach(int[] arr) {
        int N = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0;i<N;i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int findSecondLargestOptimalApproach(int[] arr) {
        int N = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0;i<N;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] numArray = {1,2,4,7,7,5};
        System.out.println("BRUTE FORCE -> SECOND LARGEST NUMBER IN THE GIVEN ARRAY IS "+findSecondLargestBruteForce(numArray));

        System.out.println("BETTER APPROACH -> SECOND LARGEST NUMBER IN THE GIVEN ARRAY IS "+findSecondLargestBetterApproach(numArray));
        System.out.println("OPTIMAL APPROACH -> SECOND LARGEST NUMBER IN THE GIVEN ARRAY IS "+findSecondLargestOptimalApproach(numArray));
    }
}
