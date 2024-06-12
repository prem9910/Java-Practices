package Operators.ShiftOperator;

public class ShiftOperator {
    
    public static void main(String[] args) {
        int a = 10, b = 20;
     
        // Left Shift Operator
        System.out.println("Left Shift Operator: " + (a << b));
        
        // Right Shift Operator
        System.out.println("Right Shift Operator: " + (a >> b));
        
        // Unsigned Right Shift Operator
        System.out.println("Unsigned Right Shift Operator: " + (a >>> b));
    }


}
