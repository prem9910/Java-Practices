
public class Example {
    public String myMethod() {
        String msg = "Hello, World!";

        return msg;
    }

    public static void main(String[] args) {
        Example example = new Example();
        String result = example.myMethod();
        System.out.println(result);
    }
}
