import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("GCD of two numbers is "+ a);
    }
    
}
