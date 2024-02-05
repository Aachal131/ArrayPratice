package com.pratice;

public class EvenArray {
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Even Number:");

        for (int i = 1; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
