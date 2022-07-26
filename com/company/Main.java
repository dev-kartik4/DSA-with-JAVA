package com.company;

public class Main {

    public static void main(String[] args) {

        String input1 =  "happyhours";
        char ch = 'h';
        String output = "";
        for(int i=0;i<input1.length();i++){
            if(input1.charAt(i) == ch)
                continue;
            else
                output = output + input1.charAt(i);
        }
        System.out.print(output);
    }
}
