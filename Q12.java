import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        int lcm = a*b;
        for(int i =1; i<= a*b;i++){
            if(i%a==0 && i%b==0){
                lcm = i;
                break;
            }
        }
        System.out.println("Lcm of two numbers is "+lcm);
    }
    
}
