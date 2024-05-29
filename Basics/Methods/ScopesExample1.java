public class ScopesExample1 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x: " + x);
        method1(x);
        method2(x);
        System.out.println("x: " + x);
    }

    public static void method1(int x) {
        System.out.println("In method1: x: " + x);
        int y = 20;
        System.out.println("In method1: y: " + y);
    }

    public static void method2(int x) {
        System.out.println("In method2: x: " + x);
        x = 30;
        System.out.println("In method2: x: " + x);
    }
}
