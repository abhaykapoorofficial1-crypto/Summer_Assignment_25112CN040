import java.util.Scanner;
public class Q44 {
    public static long fact(int n){
        long fact = 1;
        for(int i = 1 ; i<=n ; i++){
             fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println("Factorial is "+ fact(n));
    }
}
