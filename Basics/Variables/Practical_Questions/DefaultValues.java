package Basics.Variables.Practical_Questions;

public class DefaultValues {
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    boolean booleanVar;
    char charVar;

    public static void main(String[] args) {
        DefaultValues defaults = new DefaultValues();
        System.out.println("Default byte: " + defaults.byteVar);
        System.out.println("Default short: " + defaults.shortVar);
        System.out.println("Default int: " + defaults.intVar);
        System.out.println("Default long: " + defaults.longVar);
        System.out.println("Default float: " + defaults.floatVar);
        System.out.println("Default double: " + defaults.doubleVar);
        System.out.println("Default boolean: " + defaults.booleanVar);
        System.out.println("Default char: " + defaults.charVar);
    }
}

