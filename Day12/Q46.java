import java.util.Scanner;

public class Q46 {
    public static boolean armstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum = sum + digit*digit*digit;
            n/=10;
        }
        return original == sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        if(armstrong(n)){
            System.out.println("Armstrong Number");
        }
    }
}
