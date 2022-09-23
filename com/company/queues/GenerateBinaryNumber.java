package com.company.queues;

import java.util.LinkedList;
import java.util.Queue;

//GENERATE BINARY NUMBERS FROM 1 TO N USING QUEUE
public class GenerateBinaryNumber {

    public static void generateBinaryNumbers(int n){
        Queue<String> queue = new LinkedList<String>();

        queue.add("1");
        while(n-- > 0){
            String s1 = queue.peek();
            queue.remove();
            System.out.println(s1);

            String s2 = s1;

            queue.add(s1+"0");

            queue.add(s2+"1");
        }
    }
    public static void main(String args[]){
        int n = 10;
        generateBinaryNumbers(10);
    }

}
