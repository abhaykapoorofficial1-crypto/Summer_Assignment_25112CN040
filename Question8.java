
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int original = n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse *10 + digit;
            n = n/10;
        }
        if(original== reverse){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
        
            
        
    }
    
}
