package com.company.patterns;

import java.util.Scanner;

public class StarPatterns {

    /*
        *
        **
        ***
        ****
        *****
    */

    static void printLeftTriangleNumberOfStars(int N){

        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    1
    12
    123
    1234
    12345
    
    */

    static void printLeftTriangleInNumbers(int N){

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
    1
    22
    333
    4444
    55555
    */

    static void printRowNumbersInLeftTriangle(int N){

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


    /*
    *****
    ****
    ***
    **
    *
    */
    static void printReverseLeftTriangleOfStars(int N){

        for(int i=N-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    12345
    1234
    123
    12
    1
    */

    static void printReverseLeftTriangleOfNumbers(int N){

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
         *    
        ***   
       *****  
      ******* 
     *********
    */

    static void printPascalTriangle(int N){

        for(int i=0;i<N;i++){

            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        *********
         ******* 
          *****  
           ***   
            *
    */
    
    static void printReversePascalTriangle(int N){

        for(int i=0;i<N;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*N-(2*i+1);j++){
                System.out.print("*");
            }

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
        *    
       ***   
      *****  
     ******* 
    *********
    *********
     ******* 
      *****  
       ***   
        *
    */
    

    static void printCombinationOfPascalTriangle(int N){

        printPascalTriangle(N);
        printReversePascalTriangle(N);
    }

    /*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
    
    */

    static void printLeftAndReverseLeftTriangle(int N){
        for(int i=1;i<=2*N-1;i++){
            int stars = i;
            if(i>N){
                stars = 2*N-i;
            }
            for(int j=0;j<stars;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*  
        1
        01
        101
        0101
        10101
    */

    static void printZerosAndOnesInLeftTriangle(int N){

        int start = 1;
        for(int i=0;i<N;i++){
            if(i%2==0){
                start = 1;
            }else{
                start = 0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }

    /*  
        1        1
        12      21
        123    321
        1234  4321
        1234554321
    
    */

    static void printLeftAndRightTriangleOfNumbers(int N){
        int space = 2 * (N-1);
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space = space-2;
        }
    }

    /*
        1  
        2 3  
        4 5 6  
        7 8 9 10  
        11 12 13 14 15
    
    */

    static void printContinuousNumbersInPattern(int N){
        int num = 1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
    }

    /* 
        A
        AB
        ABC
        ABCD
        ABCDE
    
    */

    static void printLeftTriangleOfAlphabets(int N){

        for(int i=0;i<N;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*
        ABCDE
        ABCD
        ABC
        AB
        A
    */

    static void printReverseLeftTriangleOfAlphabets(int N){

        for(int i=N-1;i>=0;i--){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /*
        A 
        B B 
        C C C 
        D D D D 
        E E E E E
    
    */

    static void printLeftTriangleRepeatedAlphabetsPerRowNum(int N){

        for(int i=0;i<N;i++){
            char ch = (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    /*
        A    
       ABA   
      ABCBA  
     ABCDCBA 
    ABCDEDCBA
    */

    static void printPascalTriangleOfAlphabets(int N){

        for(int i=0;i<N;i++){

            char ch = 'A';
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j>=i)
                    ch--;
                else
                    ch++;
            }

            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    /*
        E  
        D E  
        C D E  
        B C D E  
        A B C D E
    
    */

    static void printReverseASCIIOfAlphabetsPascalTriangle(int N){

        for(int i=0;i<N;i++){
            for(char ch = (char) ('E'-i); ch<='E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }

    /*
        ***** *****
        ****   ****
        ***     ***
        **       **
        *         *
        *          *
        **        **
        ***      ***
        ****    ****
        *****  *****
    
    */

    static void printPattern19(int N){
        int space = 0;
        for(int i=0;i<N;i++){

            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }

            for(int j=0;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space = space-2;
            System.out.println();

        }
    }

    /*
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        ****  ****
        ***    ***
        **      **
        *        *
    */

    static void printPattern20(int N){
        int space = 2*N-2;
        for(int i=1;i<=2*N-1;i++){
            int stars = i;
            if(i>N){
                stars = 2*N-i;
            }
            for(int j=0;j<stars;j++) {
                System.out.print("*");
            }

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for(int j=0;j<stars;j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<N) space = space-2;
            else space = space+2;
        }
    }

    /*
        *****
        *   *
        *   *
        *   *
        *****
    
    */

    static void printPattern21(int N){

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0 || i==N-1 || j==0 || j==N-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
        555555555
        544444445
        543333345
        543222345
        543212345
        543222345
        543333345
        544444445
        555555555
    */

    static void printPattern22(int N){
        for(int i=0;i<2*N-1;i++){
            for(int j=0;j<2*N-1;j++){
                int top = i;
                int left = j;
                int right = (2*N-2)-j;
                int down = (2*N-2)-i;
                System.out.print(N-Math.min(Math.min(top,down), Math.min(left,right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of stars: ");
        int N = input.nextInt();

        System.out.println("Printing Left Triangle Stars:");
        printLeftTriangleNumberOfStars(N);

        System.out.println("Printing Left Triangle Numbers:");
        printLeftTriangleInNumbers(N);

        System.out.println("Printing Left Triangle Row Numbers:");
        printRowNumbersInLeftTriangle(N);

        System.out.println("Printing Left Triangle In Reverse Stars:");
        printReverseLeftTriangleOfStars(N);

        System.out.println("Printing Left Triangle In Reverse Numbers:");
        printReverseLeftTriangleOfNumbers(N);

        System.out.println("Printing Pascal Triangle Of Stars:");
        printPascalTriangle(N);

        System.out.println("Printing Reverse Pascal Triangle Of Stars:");
        printReversePascalTriangle(N);

        System.out.println("Combination of Pascal and Reverse Pascal Triangle");
        printCombinationOfPascalTriangle(N);

        System.out.println("Printing Left and Reverse Left Triangle Of Stars");
        printLeftAndReverseLeftTriangle(N);

        System.out.println("Printing Zero's and One's Triangle");
        printZerosAndOnesInLeftTriangle(N);

        System.out.println("Printing Left and Right Angle Triangle Of Numbers");
        printLeftAndRightTriangleOfNumbers(N);

        System.out.println("Printing Continuous Numbers In Triangle");
        printContinuousNumbersInPattern(N);

        System.out.println("Printing Left Triangle of Alphabets");
        printLeftTriangleOfAlphabets(N);

        System.out.println("Printing Reverse Left Triangle of Alphabets");
        printReverseLeftTriangleOfAlphabets(N);

        System.out.println("Printing Left Triangle of Alphabets As Per Row Numbers");
        printLeftTriangleRepeatedAlphabetsPerRowNum(N);

        System.out.println("Printing Pascal Triangle of Alphabets");
        printPascalTriangleOfAlphabets(N);

        System.out.println("Printing Reverse Pascal Triangle of Alphabets In Decreasing ASCII Size");
        printReverseASCIIOfAlphabetsPascalTriangle(N);

        System.out.println("Printing Pattern 19");
        printPattern19(N);

        System.out.println("Printing Pattern 20");
        printPattern20(N);

        System.out.println("Printing Pattern 21");
        printPattern21(N);

        System.out.println("Printing Pattern 22");
        printPattern22(N);
    }
}
