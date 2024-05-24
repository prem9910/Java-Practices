package Basics.Variables;

public class TypeCasting {
    public static void main(String[] args) {
        double doubleVar = 9.78;
        int intVar = (int) doubleVar;
        long longVar = (long) doubleVar;
        float floatVar = (float) doubleVar;
        byte byteVar = (byte) doubleVar;

        System.out.println("double: " + doubleVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("byte: " + byteVar);
    }
}
