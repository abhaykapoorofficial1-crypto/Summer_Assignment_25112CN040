
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum = sum + (digit*digit*digit);
            n = n / 10;
        }
        if ( sum == original){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        } 
    } 
}
