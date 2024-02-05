package com.pratice;

public class OddArray {
    public static void main(String[]args)
    {
    int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Odd Element:");
        for (int i =0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
