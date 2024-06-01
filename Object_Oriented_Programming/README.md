### Types of Methods

1.  Instance Methods: Belong to an instance of a class. They require an object of the class to be created before they can be called.

java

Copy code

`public class Calculator {
    // Instance method
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Create an object
        int result = calc.multiply(4, 5); // Call the instance method
        System.out.println(result); // Output: 20
    }
}`

1.  Static Methods: Belong to the class rather than any object instance. They can be called without creating an instance of the class.

java

Copy code

`public class MathUtils {
    // Static method
    public static int square(int number) {
        return number * number;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.square(6); // Call the static method
        System.out.println(result); // Output: 36
    }
}`

1.  Abstract Methods: Declared without an implementation. They must be implemented by subclasses. They are used in abstract classes and interfaces.

java

Copy code

`abstract class Shape {
    // Abstract method
    abstract void draw();
}

class Circle extends Shape {
    // Implementing the abstract method
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Create an object of the subclass
        shape.draw(); // Output: Drawing a circle
    }
}`

### Method Overloading

Method overloading allows multiple methods in the same class to have the same name but different parameters (different type, number, or both). The compiler determines which method to call based on the method signature.

java

Copy code

`public class PrintUtil {
    // Overloaded methods
    public void print(int number) {
        System.out.println(number);
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void print(int number, String text) {
        System.out.println(number + " " + text);
    }
}

public class Main {
    public static void main(String[] args) {
        PrintUtil util = new PrintUtil();
        util.print(10); // Output: 10
        util.print("Hello"); // Output: Hello
        util.print(10, "times"); // Output: 10 times
    }
}`

### Summary

Methods in Java are essential for defining the behavior of classes and objects. They consist of an access modifier, return type, name, parameters, and body. Java supports instance methods, static methods, and abstract methods, as well as method overloading to enhance functionality and code reuse.# Introduction to Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm that uses "objects" to design software. Java, being an object-oriented language, heavily relies on OOP concepts. Here's a look at the basic syntax and key concepts.

## Class and Object

### Class Definition

A **class** is a blueprint for creating objects. It defines attributes and methods for the objects.

```java

public class Dog {

    // Fields (attributes)

    String breed;

    int age;

    String color;

    // Method

    void bark() {

        System.out.println("Woof!");

    }

}

```

### Creating an Object

An **object** is an instance of a class. It is created using the `new` keyword.

```java

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.breed = "Labrador";

        myDog.age = 3;

        myDog.color = "Black";

        myDog.bark();

    }

}

```

## Inheritance

### Superclass

**Inheritance** allows one class to inherit the fields and methods of another. The class being inherited from is the **superclass**.

```java

public class Animal {

    void eat() {

        System.out.println("This animal eats food.");

    }

}

```

### Subclass

The class that inherits from the superclass is the **subclass**.

```java

public class Dog extends Animal {

    void bark() {

        System.out.println("Woof!");

    }

}

```

### Using Inheritance

The subclass inherits methods from the superclass.

```java

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.eat();  // Inherited method

        myDog.bark();

    }

}

```

## Polymorphism

### Method Overriding

**Polymorphism** allows one interface to be used for a general class of actions. Method overriding is a form of polymorphism.

```java

public class Animal {

    void sound() {

        System.out.println("Animal makes a sound");

    }

}

public class Dog extends Animal {

    @Override

    void sound() {

        System.out.println("Woof");

    }

}

public class Cat extends Animal {

    @Override

    void sound() {

        System.out.println("Meow");

    }

}

```

### Using Polymorphism

An object can take many forms.

```java

public class Main {

    public static void main(String[] args) {

        Animal myDog = new Dog();

        Animal myCat = new Cat();

        myDog.sound();  // Woof

        myCat.sound();  // Meow

    }

}

```

## Encapsulation

### Using Encapsulation

**Encapsulation** is the wrapping of data and methods into a single unit (class) and restricting access to some of the object's components.

```java

public class Person {

    // Private fields

    private String name;

    private int age;

    // Public getter and setter methods

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        if (age > 0) {

            this.age = age;

        }

    }

}

```

### Accessing Encapsulated Data

Using getter and setter methods to access and modify private fields.

```java

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Alice");

        person.setAge(25);

        System.out.println("Name: " + person.getName());

        System.out.println("Age: " + person.getAge());

    }

}

```

## Abstraction

### Abstract Class

**Abstraction** is the concept of hiding complex implementation details and showing only the essential features.

```java

abstract class Animal {

    // Abstract method (no implementation)

    abstract void sound();

    // Regular method

    void sleep() {

        System.out.println("This animal sleeps");

    }

}

```

### Subclass

Subclasses provide implementation for abstract methods.

```java

class Dog extends Animal {

    void sound() {

        System.out.println("Woof");

    }

}

```

### Using Abstraction

Creating objects of subclasses to use the abstract methods.

```java

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.sound();

        myDog.sleep();

    }

}

```

## Conclusion

OOP in Java provides a modular structure for programs, making it easier to manage and understand. By mastering the concepts of classes, inheritance, polymorphism, encapsulation, and abstraction, you can write efficient and organized code.