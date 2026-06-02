
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int product = 1;
        while(n>0){
           int digit = n%10;
           product = product * digit;
           n = n /10;

        }
        System.out.println("Product of digits of a number is "+ product);
        
    }
    
}
