# Primitive Data Types in Java

Java provides a rich set of built-in data types known as primitive data types. These types are the building blocks of data manipulation in Java and are predefined by the language itself. Understanding these types is crucial for any Java programmer as they form the basis of variable declaration and manipulation.

## List of Primitive Data Types

Java has eight primitive data types, each serving a specific purpose and allowing for efficient memory management.

### 1. `byte`
- **Size:** 1 byte
- **Range:** -128 to 127
- **Use Case:** Useful for saving memory in large arrays, where the memory savings actually matters.

### 2. `short`
- **Size:** 2 bytes
- **Range:** -32,768 to 32,767
- **Use Case:** Can be used to save memory in large arrays, in situations where the memory savings is important.

### 3. `int`
- **Size:** 4 bytes
- **Range:** -2,147,483,648 to 2,147,483,647
- **Use Case:** Generally used as the default data type for integer values unless there is a concern about memory.

### 4. `long`
- **Size:** 8 bytes
- **Range:** -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- **Use Case:** Used when a wider range than `int` is needed.

### 5. `float`
- **Size:** 4 bytes
- **Range:** Approximately ±3.40282347E+38F (6-7 significant decimal digits)
- **Use Case:** Useful for saving memory in large arrays of floating-point numbers.

### 6. `double`
- **Size:** 8 bytes
- **Range:** Approximately ±1.79769313486231570E+308 (15 significant decimal digits)
- **Use Case:** Used as the default data type for decimal values, generally the default choice.

### 7. `boolean`
- **Size:** 1 bit (though size may vary depending on JVM implementation)
- **Values:** `true` or `false`
- **Use Case:** Used for simple flags that track true/false conditions.

### 8. `char`
- **Size:** 2 bytes
- **Range:** 0 to 65,535 (Unicode characters)
- **Use Case:** Used to store any character.

## Example Code

Here is a simple example demonstrating the use of primitive data types in Java:

```java
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte byteVar = 100;
        short shortVar = 10000;
        int intVar = 100000;
        long longVar = 1000000000L;
        float floatVar = 234.5f;
        double doubleVar = 123.456;
        boolean booleanVar = true;
        char charVar = 'A';
        
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("boolean: " + booleanVar);
        System.out.println("char: " + charVar);
    }
}
