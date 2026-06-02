
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum of N numbers is "+ sum);
    }  
}
