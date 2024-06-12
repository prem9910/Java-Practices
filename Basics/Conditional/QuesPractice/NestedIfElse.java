package Conditional.QuesPractice;

// Write a Java program to determine the grade of a student based on their marks. Use nested if-else statements and demonstrate the use of multiple conditions.
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: E");
        } else if (marks < 50) {
            System.out.println("Grade: F");
        }
    }
}
