
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            int fact = 1;
            for(int i = 1 ; i<=digit; i++){
                fact *= i;
            }
            sum+=fact;
            n/=10;
        }
        if(original == sum){
            System.out.println(original + " is a Strong Number");
        }
        else{
            System.out.println(original + " is not a Strong Number");
        }
    }
}
