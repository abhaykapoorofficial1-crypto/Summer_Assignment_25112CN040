
import java.util.Scanner;

public class Q41 {
    public static int sum (int a , int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 'a' " );
        int a = input.nextInt();
        System.out.println("Enter the number 'b' " );
        int b = input.nextInt();
        int result = sum(a,b);
        System.out.println("Sum of two numbers is " + result);
    }
}
