import java.math.BigInteger;
import java.util.*;

public class uInput1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your mobile number: ");
        BigInteger Mobile = in.nextBigInteger();
        System.out.println("this is your mobile number: " + Mobile);

        // System.out.print("Enter your name: ");
        // String name = in.nextLine();
        // System.out.print("Enter your password: ");
        // String password = in.nextLine();
        // if(name.equals("Prem") && password.equals("12345")){

        //     System.out.println("Authorised user");
        // }else{
        //     System.out.println("Unauthorised user");
        // }


        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = in.nextInt();
        // System.out.println("Your age is: " + age);

        // if(age > 18) {
        //     System.out.println("You are eligible to vote.");
        // }else{
        //     System.out.println("You are not eligible to vote.");
        // }

        in.close();
    }
}

