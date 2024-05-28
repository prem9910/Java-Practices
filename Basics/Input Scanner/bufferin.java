import java.io.*;

public class bufferin {
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = in.readLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(in.readLine());
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        in.close();
    }
}


