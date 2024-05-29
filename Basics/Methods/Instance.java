public class Instance {

    //Instance 
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Instance obj = new Instance();
        int result = obj.multiply(5, 10);
        System.out.println(result);
    }

}
