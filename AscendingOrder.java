package com.pratice;

public class AscendingOrder {
    public static void main(String[] args){
        int[] arr = new int []{5,8,2,4,1};
        int temp =0;
        System.out.println("Element in Array before Ascending order");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i =0;i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]>arr[j])){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                }
            }
        System.out.println("Elements of array after Ascending order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

