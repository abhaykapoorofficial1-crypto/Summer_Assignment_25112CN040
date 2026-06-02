
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int count = 0;
        while(n>0){
            count += n % 2;
            n/=2;
        }
        System.out.println("Number of set bits "+ count);
    } 
}
