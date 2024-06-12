// 2. Create a class named Rectangle with attributes length and breadth (or width) and methods to calculate and display the area. Use the Scanner class to get user input for the rectangle's dimensions. (Area of Rectangle = Length*Breadth) 

import java.util.*;

class Rectangle {
    double length, breadth;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sc.nextDouble();
        System.out.println("Enter breadth: ");
        breadth = sc.nextDouble();
        sc.close();
    }

    public void display() {
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}
