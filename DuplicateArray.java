package com.pratice;

public class DuplicateArray {
    public static void main(String [] args){
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 7, 8, 9, 3, 5};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
