import java.util.Scanner;

public class Q28 {
    static int reverse = 0;
    static int reversenumber(int n){
        if(n==0)
            return reverse;
        reverse = reverse*10 + (n%10);
        return reversenumber(n/10);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println(reversenumber(n));
    } 
}
