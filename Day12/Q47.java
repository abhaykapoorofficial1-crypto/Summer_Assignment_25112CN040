import java.util.Scanner;

public class Q47 {
    public static void fibonacci(int n){
        int a = 0 ; int b = 1;
        for(int i = 1 ; i<=n ; i++){
            System.out.print(a+ " ");
            int c = a + b;
            a = b;
            b = c ;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of terms");
        int n = input.nextInt();
        fibonacci(n);
    }  
}
