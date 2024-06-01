public class CircleStaticMembers {
    static double PI = 3.14;
    double radius;

    //method to calculate area

    double area() {
        return PI * radius * radius;
    }
    public static void main(String[] args) {

        CircleStaticMembers c1 = new CircleStaticMembers();
        c1.radius = 3;
        System.out.println("Area of circle1: " + c1.area());
        CircleStaticMembers c2 = new CircleStaticMembers();
        c2.radius = 5;
        System.out.println("Area of circle: " + c2.area());
    }

}
