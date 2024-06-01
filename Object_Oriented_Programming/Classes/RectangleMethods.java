public class RectangleMethods {
    int length;
    int width;

     //Method to calculate area
    public void area() {
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    //Method to calculate perimeter
    public void perimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        RectangleMethods rectangle = new RectangleMethods();
        rectangle.length = 10;
        rectangle.width = 5;
        rectangle.area();
        rectangle.perimeter();
    }
}
