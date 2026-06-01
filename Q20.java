
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number ");
        long n = input.nextLong();
        long largestprimefactor = 1;
        for(long i =2; i<=n; i++){
            while(n % i == 0){
                largestprimefactor = i;
                n/=i;
            }
        }
        System.out.println("Largest Prime Factor = " + largestprimefactor);
    }
}
