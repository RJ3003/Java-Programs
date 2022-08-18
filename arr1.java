package com.company;

public class arr1 {
    public static void main(String[] args) {
        int []arr={10,20,30,50};
        System.out.println(arr.length);
        for (int i=arr.length-1; i>=0;i--) {
            System.out.println(arr[i]);
        }
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int element: arr){
            System.out.println(element);

            
        }


    }
}
