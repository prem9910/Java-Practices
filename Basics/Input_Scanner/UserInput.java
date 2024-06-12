// 1. Create a class named Person with attributes name and age. Use Scanner to get user input for a name and age, then create a Person object and greet the user by name and age.

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        in.nextLine(); // Consume the newline character

        Person person = new Person(name, age);
        person.greet();

        in.close();
    }
}
