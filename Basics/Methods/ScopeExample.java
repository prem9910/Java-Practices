public class ScopeExample {
    // Class field
    private int number = 10;

    public void showScope() {
        // Local variable
        int number = 20;
        System.out.println("Local variable: " + number); // Outputs 20
        System.out.println("Class field: " + this.number); // Outputs 10
    }

    public void anotherMethod() {
        // Trying to access the local variable 'number' from showScope() will cause an error
        System.out.println(number); // Error: Cannot find symbol
    }

    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();
        example.showScope();
        example.anotherMethod();
    }
}
