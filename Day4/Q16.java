
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting number");
        int start = input.nextInt();
        System.out.println("Enter ending number");
        int end = input.nextInt();
        System.out.println("Armstrong numbers are");
        for( int i =start ; i<=end ; i++){
            int n = i;
            int sum = 0;
            while(n>0){
                int digit = n%10;
                sum = sum + (digit*digit*digit);
                n = n/10;
            }
            if(sum==i){
                System.out.println(i +" ");
            }
        }
    } 
}
