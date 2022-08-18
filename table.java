package com.company;

public class table {
    public static void main(String[] args) {
        int n = 3;
        int product = 1;

        for (int i = 1; i<=10; i++){
            product = n * i;
            System.out.println(n + "x" + i + "=" + product);
        }
    }
}
