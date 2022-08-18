package com.company;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int product = 1;

        for (int i = 1; i<=10; i++){
            product = n * i;
            System.out.println(n + " x " + i + " = " + product);
        }
    }
}
