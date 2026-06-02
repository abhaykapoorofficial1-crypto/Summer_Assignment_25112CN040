
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base (x) ");
        int x = input.nextInt();
        System.out.println("Enter exponent(n): ");
        int n = input.nextInt();
        long result = 1;
        for(int i = 1 ; i<=n ; i++){
            result *= x ;
        }
        System.out.println(x + "^" + n + " = " + result);
    }
}
