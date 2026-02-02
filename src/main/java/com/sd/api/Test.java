package com.sd.api;

public class Test {
    public static void main(String[] args) {
        int arr[] ={2, 4, 9, 7, 8};

        int highest = Integer.MIN_VALUE, secondhighest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > highest) {
                secondhighest = highest;
                highest = arr[i];

            }

        }

        Math.sqrt(4);
        System.out.println(secondhighest);
    }
}
