import java.util.Scanner;

public class Q45 {
    public static boolean  palindrome (int n){
        int reverse = 0;
        int original = n ;
        while(n>0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n/=10;
        }
        return original == reverse;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        if(palindrome(n)){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
