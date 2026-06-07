
import java.util.Scanner;

public class Q42 {
    public static int max(int a , int b){
        if(a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = input.nextInt();
        System.out.println("Enter the second number ");
        int b = input.nextInt();
        int result = max(a,b);
        System.out.println("Maximum Number is "+ result);
    }
}
