
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int sum =0;
        while(n>0){
            int digit = n% 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("Sum of digits of a number is "+ sum);
    } 
}
