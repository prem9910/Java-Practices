public class Overloading {
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

    public static void main(String[] args) {
        Overloading util = new Overloading();
        util.print(10); // Output: 10
        util.print("Hello"); // Output: Hello
        util.print(10, "times"); // Output: 10 times
    }
}
