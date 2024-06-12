package Input_Scanner;

import java.util.Scanner;

public class InputBasic {

    public static void main(String[] args) {
        int a = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = scan.nextInt();
        System.out.println("Output : " + a);

        System.out.println("Enter a String : ");
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("Output : " + s);

        System.out.println("Enter a Character : ");
        char c = scan.next().charAt(0);
        System.out.println("Output : " + c);

        System.out.println("Enter a Float : ");
        float f = scan.nextFloat();
        System.out.println("Output : " + f);


        //Commandline arguments
        // System.out.println("Output : " + args[0]);
    }
}
