# Operators in Java

Operators in Java are symbols that perform specific operations on operands. Operands can be variables, constants, or expressions. Java supports various types of operators, each serving a different purpose in manipulating data and controlling program flow. Let's explore the main categories of operators in Java:

## 1. Arithmetic Operators

Arithmetic operators perform mathematical operations on numeric operands. They include addition (+), subtraction (-), multiplication (*), division (/), and modulus (remainder) (%). For example:

- `int result = 10 + 5; // Addition`

- `int result = 10 - 5; // Subtraction`

- `int result = 10 * 5; // Multiplication`

- `int result = 10 / 5; // Division`

- `int result = 10 % 5; // Modulus`

## 2. Assignment Operators

Assignment operators are used to assign values to variables. They include simple assignment (=) as well as compound assignment operators like addition assignment (+=), subtraction assignment (-=), multiplication assignment (*=), division assignment (/=), and modulus assignment (%=).

## 3. Relational Operators

Relational operators compare two values and return a boolean result. They include equal to (==), not equal to (!=), greater than (>), less than (<), greater than or equal to (>=), and less than or equal to (<=). For example:

- `boolean result = (10 == 5); // false`

- `boolean result = (10 > 5); // true`

## 4. Logical Operators

Logical operators perform logical operations on boolean operands. They include logical AND (&&), logical OR (||), and logical NOT (!). For example:

- `boolean result = (true && false); // false`

- `boolean result = (true || false); // true`

## 5. Bitwise Operators

Bitwise operators perform operations at the bit level. They include bitwise AND (&), bitwise OR (|), bitwise XOR (^), bitwise NOT (~), left shift (<<), right shift (>>), and unsigned right shift (>>>).

## 6. Ternary Operator

The ternary operator is a conditional operator that evaluates a boolean expression and returns one of two values depending on the result. Its syntax is:

```

(condition) ? value1 : value2

```

For example:

- `int max = (10 > 5) ? 10 : 5; // max will be assigned the greater of 10 and 5`

Understanding these operators is essential for writing efficient Java programs. They allow developers to perform various operations, manipulate data, and make decisions within their code. Mastery of operators enables programmers to write concise and expressive code that efficiently achieves desired functionality.