package com.company.strings;

public class CheckPalindrome {

    public static boolean isPalindrome(String word){
        char charArray[] = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end){
            if(charArray[start] != charArray[end])
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String args[]){
        boolean result = isPalindrome("SIR");
        System.out.println("THE GIVEN WORD IS PALINDROME - "+result);
    }
}
