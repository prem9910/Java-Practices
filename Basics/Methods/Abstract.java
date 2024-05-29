abstract class Shape {
    //Abstract Method
    public abstract void draw();
}

class Rectangle extends Shape {
    //Concrete Method
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}


public class Abstract {

    public static void main(String[] args) {
        Shape shape = new Rectangle();  // Create an object of the subclass
        shape.draw();
    }
    
}
