import java.util.*;
public class uInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any interger number: ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        in.close();
    }
}
