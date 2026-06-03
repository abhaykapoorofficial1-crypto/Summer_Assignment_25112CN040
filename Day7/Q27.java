import java.util.Scanner;
public class Q27 {
    static int sumofdigits(int n){
        if(n==0)
            return 0;
        return ( n % 10) + sumofdigits(n/10);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println(sumofdigits(n)); 
    }
}
