package Conditional.QuesPractice;

// Write a Java program to compare two numbers and print "Equal" if they are equal, "Greater" if one number is greater than the other, and "Lesser" if one number is lesser than the other. Use the ternary operator.

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        String result = (num1 == num2) ? "Equal" : (num1 > num2) ? "Greater" : "Lesser";
        System.out.println("Result: " + result);
        sc.close();
    }
}
