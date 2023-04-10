package com.bridgelabz;

public class FindElementFrequency {
    public static void main(String[] args) {
        int[] arr1 = {39,45,12,39,7,39,7,45};
        int[] arr2 ={0,0,0,0,0,0,0,0};
        for (int i=0 ; i < arr1.length; i++) {
            if(arr2[i] != -1) {
                int count = 1;
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] == arr1[j]) {
                        arr2[j] = -1;
                        count++;
                    }
                }
                System.out.println(arr1[i] + "->" + count);
            }
        }
    }
}
