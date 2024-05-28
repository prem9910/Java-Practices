import java.util.*;

class Circle {
    double radius;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = sc.nextDouble();
        sc.close();
    }

    public void display() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
