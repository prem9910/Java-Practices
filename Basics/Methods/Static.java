public class Static {
    //Static Method
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println(result);
    }
}
