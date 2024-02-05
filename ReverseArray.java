package com.pratice;

public class ReverseArray {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Elements in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
