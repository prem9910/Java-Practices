# Data Types in Java

In Java, data types specify the size and type of values that can be stored in variables. Java has two categories of data types: primitive data types and reference data types. This guide covers the different types of data types in Java, including their characteristics and usage.

## Primitive Data Types

Primitive data types are the most basic data types in Java. They are predefined by the language and are directly supported by the Java programming language.

### Numeric Data Types

1. **`byte`:** 1 byte, -128 to 127
2. **`short`:** 2 bytes, -32,768 to 32,767
3. **`int`:** 4 bytes, -2,147,483,648 to 2,147,483,647
4. **`long`:** 8 bytes, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
5. **`float`:** 4 bytes, 6-7 significant decimal digits
6. **`double`:** 8 bytes, 15 significant decimal digits

### Boolean Data Type

1. **`boolean`:** Represents true or false values, typically used for conditional statements.

### Character Data Type

1. **`char`:** 2 bytes, 0 to 65,535 (Unicode characters), represents a single character.

## Reference Data Types

Reference data types are objects in Java, which are created dynamically and can be of various types.

1. **`String`:** Represents a sequence of characters, used for storing text.
2. **Arrays:** Collections of similar type of elements, used for storing multiple values of the same data type.

## Practical Questions on Primitive Data Types in JavaPractical Questions on Primitive Data Types in Java

1. **[Basic Data Type Assignment](BasicDataTypeAssignment.java):** Write a Java program to declare variables of all primitive data types and initialize them with appropriate values. Print the values of these variables.

2. **[Range Checking](RangeChecking.java):** Write a Java program to check and display the range of byte, short, int, and long data types using constants from the `java.lang` package.

3. **[Arithmetic Operations](ArithmeticOperations.java):** Write a Java program to perform basic arithmetic operations (addition, subtraction, multiplication, division) on variables of different primitive data types (int, float, double) and display the results.

4. **[Type Casting](TypeCasting.java):** Write a Java program to demonstrate type casting. Convert a double value to int, long, float, and byte, and print the results. Observe and explain any data loss.

5. **[Boolean Logic](BooleanLogic.java):** Write a Java program to demonstrate the use of boolean data type in conditional statements. Create a simple program that uses boolean variables in if-else conditions to print different messages.

6. **[Character Operations](CharacterOperations.java):** Write a Java program to demonstrate character operations. Initialize a char variable with a letter, increment its value, and print the next character in the alphabet.

7. **[Floating Point Precision](FloatingPointPrecision.java):** Write a Java program to show the difference in precision between float and double. Perform arithmetic operations with both types and print the results to see how precision differs.

8. **[Unicode Characters](UnicodeCharacters.java):** Write a Java program to print a set of Unicode characters. Initialize a char variable with different Unicode values and display the corresponding characters.

9. **[Default Values](DefaultValues.java):** Write a Java program to demonstrate the default values of primitive data types. Create a class with instance variables of each primitive type and print their default values without initializing them.

10. **[Temperature Conversion](TemperatureConversion.java):** Write a Java program that converts a given temperature from Celsius to Fahrenheit and vice versa using float or double data types for the temperature values.

11. **[Data Type Limits](DataTypeLimits.java):** Write a Java program that assigns the maximum and minimum values to byte, short, int, and long variables using constants from `java.lang.Integer`, `java.lang.Byte`, etc., and prints them.

12. **[Simple Calculator](SimpleCalculator.java):** Write a Java program to create a simple calculator that takes two numbers as input and performs addition, subtraction, multiplication, and division operations on them. Use int, float, or double as needed and print the results.


## Usage

- Use primitive data types for simple values like integers, floating-point numbers, characters, and boolean values.
- Use reference data types when working with more complex data structures like strings, arrays, and objects.

## Conclusion

Understanding data types in Java is crucial for writing effective and efficient code. By choosing the appropriate data type for your variables, you can ensure proper memory allocation and efficient data manipulation in your Java programs.

Happy coding!
