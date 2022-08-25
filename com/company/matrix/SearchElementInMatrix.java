package com.company.matrix;

public class SearchElementInMatrix {

    public void searchElement(int[][] matrix,int n,int x){
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(matrix[i][j] == x){
                System.out.print("x: "+x+" found at -> "+i+","+j);
                return;
            }
            if(matrix[i][j]>x)
                j--;
            else
                i++;
        }
        System.out.println("ELEMENT NOT FOUND");
    }
    public static void main(String args[]){

        SearchElementInMatrix mst = new SearchElementInMatrix();
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,51}
        };

        System.out.println();
        mst.searchElement(matrix,4,32);
    }
}
