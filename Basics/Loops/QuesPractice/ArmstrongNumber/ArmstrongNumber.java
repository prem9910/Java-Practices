package Loops.QuesPractice.ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}


/*
    Algorithm:
    1. Take input from the user
    2. Declare a variable to store the sum
    3. Take the input number and store it in a temporary variable
    4. While the temporary variable is not equal to 0
        a. Extract the last digit of the temporary variable and store it in a separate variable
        b. Raise the digit to the power of 3 and add it to the sum
        c. Remove the last digit from the temporary variable by dividing it by 10
    5. Check if the sum is equal to the input number
        a. If yes, print the number is an Armstrong number
        b. Otherwise, print the number is not an Armstrong number
*/
