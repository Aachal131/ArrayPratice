package com.pratice;

public class ElementOfArray {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the array
        System.out.println("Elements of the array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
