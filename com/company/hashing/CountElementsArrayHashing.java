package com.company.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountElementsArrayHashing {

    static void checkFrequencyOfElementsByHashing(int[] arr,int N) {

        Map<Integer, Integer> numberFrequencyMap = new HashMap<>();

        for(int i=0; i<N; i++) {
            if(numberFrequencyMap.containsKey(arr[i])) {
                numberFrequencyMap.put(arr[i], numberFrequencyMap.get(arr[i]) + 1);
            }else{
                numberFrequencyMap.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {

        int[] numArray = { 1, 2, 3, 4, 3, 2, 1, 4, 5, 6 };
        checkFrequencyOfElementsByHashing(numArray,numArray.length);
    }
}
