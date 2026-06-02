
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series is ");
        for(int i =1;i<n;i++){
            System.out.println(a +"");
            int c = a + b;
            a=b;
            b=c;
        }
    }  
}
