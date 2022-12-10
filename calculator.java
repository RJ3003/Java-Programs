
package com.company;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter num 2: ");
        int b = sc.nextInt();

        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for substraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                int c = a + b;
                System.out.println(c);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;

            default:
                System.out.println("invalid opt");
        }
    }
}
